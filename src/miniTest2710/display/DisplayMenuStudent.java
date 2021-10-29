package miniTest2710.display;

import miniTest2710.model.Student;
import miniTest2710.service.implement.ManageStudent;

import java.io.*;
import java.util.Scanner;

public class DisplayMenuStudent {
    public static int idd = 1;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static void main(String[] args) throws IOException {

        ManageStudent manageStudent = new ManageStudent();
        int numcheck = -1;

        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println(ANSI_CYAN+"Menu");
                System.out.println("1. Add Student");
                System.out.println("2. Edit Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Find Student");
                System.out.println("5. Print Student");
                System.out.println("6. Sort in descending order ");
                System.out.println("7. Highest Score ");
                System.out.println("8. Write data to file ");
                System.out.println("9. Read data file ");
                System.out.println("0. Exit"+ ANSI_RESET);
                System.out.println(ANSI_YELLOW+"Enter your choice: "+ ANSI_RESET);
                numcheck = scanner.nextInt();
                if (numcheck != 0) {
                    switch (numcheck) {
                        case 1:
                            Student addStudent = getStudent(scanner);
                            int id;
                            String name;
                            int age;
                            double score;
                            manageStudent.add(addStudent);
                            manageStudent.print();
                            break;
                        case 2:
                            System.out.println("Enter the student ID to edit: ");
                            int idEdit = scanner.nextInt();
                            if (manageStudent.checkId(idEdit)) {
                                Student editStudent = getStudentEdit(scanner, idEdit);
                                manageStudent.edit(idEdit, editStudent);
                                manageStudent.print();
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the student ID to delete: ");
                            int idDelete = scanner.nextInt();
                            if (manageStudent.checkId(idDelete)) {
                                manageStudent.delete(idDelete);
                                manageStudent.print();
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 4:
                            System.out.println("Enter the student ID to Find: ");
                            id = scanner.nextInt();
                            if (manageStudent.checkId(id)) {
                                manageStudent.printId(manageStudent.find(id));
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 5:
                            System.out.println("List Student: ");
                            manageStudent.print();
                            break;
                        case 6:
                            System.out.println("Sort in descending order");
                            manageStudent.gradePointAverageSort();
                            manageStudent.print();
                            break;
                        case 7:
                            manageStudent.ScoreHighest();
                            break;
                        case 8:
                            System.out.print("Enter the file path you want to write data to: ");
                            scanner.nextLine();
                            String nameFile = scanner.nextLine();
                            try {
                                BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile));
//                        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\miniTest2710\\student.csv"));
                                String str = "Name,ID,Age,Math Score,Physics Scores,Chemistry Scores,Grade Point Average";
                                for (int i = 0; i < manageStudent.getListStudent().size(); i++) {
                                    Student student = (Student) manageStudent.getListStudent().get(i);
                                    str += "\n" + student.getName() + ",";
                                    str += student.getId() + ",";
                                    str += student.getAge() + ",";
                                    str += student.getMathScores() + ",";
                                    str += student.getPhysicsScores() + ",";
                                    str += student.getChemistryScores() + ",";
                                    str += student.getGradePointAverage();
                                }
                                bw.write(str);
                                bw.close();
                            } catch (FileNotFoundException e) {
                                System.out.println(ANSI_RED + "The system cannot find the file specified"+ ANSI_RESET);
                            } finally {
                                break;
                            }
                        case 9:
                            try {
                                System.out.print("Enter the file path you want to read data to: ");
                                scanner.nextLine();
                                nameFile = scanner.nextLine();
                                File file = new File(nameFile);
                                if (!file.exists()) {
                                    throw new FileNotFoundException();
                                }
                                BufferedReader br = new BufferedReader(new FileReader(nameFile));
                                String read = br.readLine();
                                while ((read = br.readLine()) != null) {
                                    String[] arr = read.split(",");
                                    name = arr[0];
                                    id = Integer.parseInt(arr[1]);
                                    age = Integer.parseInt(arr[2]);
                                    double mathScores = Double.parseDouble(arr[3]);
                                    double physicsScores = Double.parseDouble(arr[4]);
                                    double chemistryScores = Double.parseDouble(arr[5]);
                                    double gradePointAverage = Double.parseDouble(arr[6]);
                                    manageStudent.add(new Student(name, age, id, mathScores, physicsScores, chemistryScores));
                                }
                                manageStudent.print();
                            } catch (FileNotFoundException e) {
                                System.out.println(ANSI_RED + "The system cannot find the file specified"+ ANSI_RESET);
                            } finally {
                                break;
                            }
                        default:
                            System.out.println("This item is not available");
                    }
                }
            }catch (java.util.InputMismatchException e){
                System.err.println("please enter number");
            }
        } while (numcheck != 0);
    }


    private static Student getStudentEdit(Scanner scanner, int id) {
        int age;
        double mathScores;
        double physicsScores;
        double chemistryScores;
        String name;
        scanner.nextLine();
        System.out.println("Enter information New student: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Score Math: ");
        mathScores = scanner.nextDouble();
        System.out.print("Score Physics: ");
        physicsScores = scanner.nextDouble();
        System.out.print("Score Chemistry: ");
        chemistryScores = scanner.nextDouble();
        Student updateStudent = new Student(name, age, id, mathScores, physicsScores, chemistryScores);
        return updateStudent;
    }

    private static Student getStudent(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter information New student: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        int id = idd++;
        System.out.print("Score Math: ");
        double mathScores = scanner.nextDouble();
        System.out.print("Score Physics: ");
        double physicsScores = scanner.nextDouble();
        System.out.print("Score Chemistry: ");
        double chemistryScores = scanner.nextDouble();
        Student newStudent = new Student(name, age, id, mathScores, physicsScores, chemistryScores);
        return newStudent;
    }
}
