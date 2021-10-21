package miniTest.service;

import miniTest.service.implement.ManagerPerson;
import miniTest.model.Student;
import miniTest.model.Teacher;

import java.util.Scanner;

public class ShowMenuPerson {
    public static int idd = 1;

    public static void main(String[] args) {
        ManagerPerson managerPerson = new ManagerPerson();
        int numcheck1 = -1;
        int numcheck2 = -1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add person");
            System.out.println("2. Edit person");
            System.out.println("3. Delete person");
            System.out.println("4. Find person");
            System.out.println("5. Print person");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            numcheck1 = scanner.nextInt();
            if (numcheck1 != 0) {
                switch (numcheck1) {
                    case 1:
                        System.out.println("1.student");
                        System.out.println("2.teacher");
                        numcheck2 = scanner.nextInt();
                        if (numcheck2 != 0) {
                            switch (numcheck2) {
                                case 1:
                                    Student newStudent = getStudent(scanner);
                                    managerPerson.add(newStudent);
                                    managerPerson.print();
                                    break;
                                case 2:
                                    Teacher newTeacher = getTeacher(scanner);
                                    managerPerson.add(newTeacher);
                                    managerPerson.print();
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1.edit to student");
                        System.out.println("2.edit to teacher");
                        numcheck2 = scanner.nextInt();
                        if (numcheck2 != 0) {
                            switch (numcheck2) {
                                case 1:
                                    System.out.println("Enter the person ID to edit: ");
                                    int idEdit = scanner.nextInt();
                                    if (managerPerson.checkId(idEdit)) {
                                        Student editStudent = getStudentEdit(scanner, idEdit);
                                        managerPerson.edit(idEdit, editStudent);
                                        managerPerson.print();
                                    } else {
                                        System.out.println("This item is not available");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the person ID to edit: ");
                                    idEdit = scanner.nextInt();
                                    if (managerPerson.checkId(idEdit)) {
                                        Teacher editTeacher = getTeacherEdit(scanner, idEdit);
                                        managerPerson.edit(idEdit, editTeacher);
                                        managerPerson.print();
                                    } else {
                                        System.out.println("This item is not available");
                                    }
                                    break;
                                default:
                                    System.out.println("This item is not available");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Enter the person ID to delete: ");
                        int idDelete = scanner.nextInt();
                        if (managerPerson.checkId(idDelete)) {
                            managerPerson.delete(idDelete);
                            managerPerson.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the person ID to Find: ");
                        int id = scanner.nextInt();
                        if (managerPerson.checkId(id)) {
                            managerPerson.printId(managerPerson.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List person: ");
                        managerPerson.print();
                        break;

                    default:
                        System.out.println("This item is not available");
                }
            }
        }
        while (numcheck1 != 0);
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
        Student newStudent = new Student(name, age, score, id);
        return newStudent;
    }

    private static Teacher getTeacher(Scanner scanner) {
        int id;
        String name;
        int age;
        scanner.nextLine();
        System.out.println("Enter information New student: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Age: ");
        age = scanner.nextInt();
        System.out.print("subjects: ");
        scanner.nextLine();
        String subjects = scanner.nextLine();
        id = idd++;
        Teacher newTeacher = new Teacher(name, age, id, subjects);
        return newTeacher;
    }

    private static Student getStudentEdit(Scanner scanner, int iid) {
        scanner.nextLine();
        System.out.println("Enter information New person: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Score:");
        double score = scanner.nextDouble();
        Student editStudent = new Student(name, age, score, iid);
        return editStudent;
    }

    private static Teacher getTeacherEdit(Scanner scanner, int iid) {
        scanner.nextLine();
        System.out.println("Enter information New person: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("subjects: ");
        scanner.nextLine();
        String subjects = scanner.nextLine();
        Teacher editTeacher = new Teacher(name, age, iid, subjects);
        return editTeacher;
    }
}
