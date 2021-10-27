package miniTest2710.display;

import miniTest2710.model.Student;
import miniTest2710.service.implement.ManageStudent;

import java.util.Scanner;

public class DisplayMenuStudent {
    public static int idd = 1;

    public static void main(String[] args) {
//        ManageStudent manageStudent = new ManageStudent();
//        Student addStudent = new Student("d", 2, 2, 2, 2, 2);
//        Student addStudent2 = new Student("w", 2, 3, 9, 9, 2);
//        Student addStudent3 = new Student("a", 2, 4, 2, 5, 2);
//        Student editStudent = new Student("e", 2, 5, 9, 5, 8);
//        manageStudent.add(addStudent);
//        manageStudent.add(addStudent2);
//        manageStudent.add(addStudent3);
//        manageStudent.gradePointAverageSort();
//        manageStudent.edit(3, editStudent);
//        manageStudent.delete(4);
//        System.out.println();
//        manageStudent.print();
//        System.out.println();
//        manageStudent.ScoreHighest();
//        manageStudent.printId(manageStudent.find(2));


        ManageStudent manageStudent = new ManageStudent();
        int numcheck = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Find Student");
            System.out.println("5. Print Student");
            System.out.println("6. Sort in descending order ");
            System.out.println("7. Highest Score ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
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
                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (numcheck != 0);
    }

    private static Student getStudentEdit(Scanner scanner, int iid) {
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
        Student newStudent = new Student(name, age, iid, mathScores, physicsScores, chemistryScores);
        return newStudent;
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
        Student updateStudent = new Student(name, age, id, mathScores, physicsScores, chemistryScores);
        return updateStudent;
    }
}
