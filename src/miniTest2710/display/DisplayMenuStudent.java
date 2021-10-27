package miniTest2710.display;

import miniTest2710.model.Student;
import miniTest2710.service.implement.ManageStudent;

public class DisplayMenuStudent {
    public static int idd = 1;

    public static void main(String[] args) {
        ManageStudent ManageStudent = new ManageStudent();
        Student addStudent = new Student("d", 2, 2, 2, 2, 2);
        Student addStudent2 = new Student("w", 2, 3, 9, 9, 2);
        Student addStudent3 = new Student("a", 2, 4, 2, 5, 2);
        Student editStudent = new Student("e", 2, 5, 9, 5, 8);
        ManageStudent.add(addStudent);
        ManageStudent.add(addStudent2);
        ManageStudent.add(addStudent3);
        ManageStudent.gradePointAverageSort();
        ManageStudent.edit(3, editStudent);
        ManageStudent.delete(4);
        System.out.println();
        ManageStudent.print();
        System.out.println();
        ManageStudent.ScoreHighest();
        ManageStudent.printId(ManageStudent.find(2));


//        ManageStudent ManageStudent = new ManageStudent();
//        int numcheck = -1;
//        do {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Menu");
//            System.out.println("1. Add Student");
//            System.out.println("2. Edit Student");
//            System.out.println("3. Delete Student");
//            System.out.println("4. Find Student");
//            System.out.println("5. Print Student");
//            System.out.println("6. Sort in descending order ");
//            System.out.println("7. Sort in ascending order ");
//            System.out.println("8. Total Score ");
//            System.out.println("0. Exit");
//            System.out.println("Enter your choice: ");
//            numcheck = scanner.nextInt();
//            if (numcheck != 0) {
//                switch (numcheck) {
//                    case 1:
//                        Student addStudent = getStudent(scanner);
//                        int id;
//                        String name;
//                        int age;
//                        double score;
//                        ManageStudent.add(addStudent);
//                        ManageStudent.print();
//                        break;
//                    case 2:
//                        System.out.println("Enter the student ID to edit: ");
//                        int idEdit = scanner.nextInt();
//                        if (ManageStudent.checkId(idEdit)) {
//                            Student editStudent = getStudentEdit(scanner, idEdit);
//                            ManageStudent.edit(idEdit, editStudent);
//                            ManageStudent.print();
//                        } else {
//                            System.out.println("This item is not available");
//                        }
//                        break;
//                    case 3:
//                        System.out.println("Enter the student ID to delete: ");
//                        int idDelete = scanner.nextInt();
//                        if (ManageStudent.checkId(idDelete)) {
//                            ManageStudent.delete(idDelete);
//                            ManageStudent.print();
//                        } else {
//                            System.out.println("This item is not available");
//                        }
//                        break;
//                    case 4:
//                        System.out.println("Enter the student ID to Find: ");
//                        id = scanner.nextInt();
//                        if (ManageStudent.checkId(id)) {
//                            ManageStudent.printId(ManageStudent.find(id));
//                        } else {
//                            System.out.println("This item is not available");
//                        }
//                        break;
//                    case 5:
//                        System.out.println("List Student: ");
//                        ManageStudent.print();
//                        break;
////                    case 6:
////                        System.out.println("Sort in descending order");
////                        ManageStudent.sortDescending();
////                        ManageStudent.print();
////                        break;
//                    case 7:
//                        System.out.println("Sort in ascending order");
//                        ManageStudent.gradePointAverageSort();
//                        ManageStudent.print();
//                        break;
//                    default:
//                        System.out.println("This item is not available");
//                }
//            }
//        } while (numcheck != 0);
//    }
//
//    private static Student getStudentEdit(Scanner scanner, int iid) {
//        int age;
//        double score;
//        String name;
//        scanner.nextLine();
//        System.out.println("Enter information New student: ");
//        System.out.print("Name: ");
//        name = scanner.nextLine();
//        System.out.print("Age: ");
//        age = scanner.nextInt();
//        System.out.print("Score: ");
//        score = scanner.nextDouble();
//        Student newStudent = new Student(name, age, score, iid);
//        return newStudent;
//    }
//
//    private static Student getStudent(Scanner scanner) {
//        scanner.nextLine();
//        System.out.println("Enter information New student: ");
//        System.out.print("Name: ");
//        String name = scanner.nextLine();
//        System.out.print("Age: ");
//        int age = scanner.nextInt();
//        int id = idd++;
//        System.out.print("Score: ");
//        double score = scanner.nextDouble();
//        Student updateStudent = new Student(name, age, score, id);
//        return updateStudent;
//    }
    }
}