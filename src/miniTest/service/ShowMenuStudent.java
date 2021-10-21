package miniTest.service;

import miniTest.model.Student;
import miniTest.service.implement.ManagerStudent;

import java.util.Scanner;

public class ShowMenuStudent {
    public static int idd = 1;

    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
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
            System.out.println("7. Sort in ascending order ");
            System.out.println("8. Total Score ");
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
                        managerStudent.add(addStudent);
                        managerStudent.print();
                        break;
                    case 2:
                        System.out.println("Enter the student ID to edit: ");
                        int idEdit = scanner.nextInt();
                        if (managerStudent.checkId(idEdit)) {
                            Student editStudent = getStudentEdit(scanner, idEdit);
                            managerStudent.edit(idEdit, editStudent);
                            managerStudent.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the student ID to delete: ");
                        int idDelete = scanner.nextInt();
                        if (managerStudent.checkId(idDelete)) {
                            managerStudent.delete(idDelete);
                            managerStudent.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the student ID to Find: ");
                        id = scanner.nextInt();
                        if (managerStudent.checkId(id)) {
                            managerStudent.printId(managerStudent.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List Student: ");
                        managerStudent.print();
                        break;
                    case 6:
                        System.out.println("Sort in descending order");
                        managerStudent.sortDescending();
                        managerStudent.print();
                        break;
                    case 7:
                        System.out.println("Sort in ascending order");
                        managerStudent.sortAscending();
                        managerStudent.print();
                        break;
                    case 8:
                        managerStudent.getTotalScore();
                        break;
                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (numcheck != 0);
    }

    private static Student getStudentEdit(Scanner scanner, int iid) {
        int age;
        double score;
        String name;
        scanner.nextLine();
        System.out.println("Enter information New student: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("Score: ");
        score = scanner.nextDouble();
        Student newStudent = new Student(name, age, score, iid);
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
        System.out.print("Score: ");
        double score = scanner.nextDouble();
        Student updateStudent = new Student(name, age, score, id);
        return updateStudent;
    }
}
