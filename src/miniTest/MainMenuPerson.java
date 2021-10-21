package miniTest;

import miniTest.main.ManagerPerson;
import miniTest.model.Studen;
import miniTest.model.Teacher;

import java.util.Scanner;

public class MainMenuPerson {
    public static int idd = 1;

    public static void main(String[] args) {
        ManagerPerson managerPerson = new ManagerPerson();
        int numcheck1 = -1;
        int numcheck2 = -1;
        do {
            Scanner sa = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add person");
            System.out.println("2. Edit person");
            System.out.println("3. Delete person");
            System.out.println("4. Find person");
            System.out.println("5. Print person");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            numcheck1 = sa.nextInt();
            if (numcheck1 != 0) {
                switch (numcheck1) {
                    case 1:
                        System.out.println("1.student");
                        System.out.println("2.teacher");
                        numcheck2 = sa.nextInt();
                        if (numcheck2 != 0) {
                            switch (numcheck2) {
                                case 1:
                                    Studen p = getStuden(sa);
                                    managerPerson.add(p);
                                    managerPerson.print();
                                    break;
                                case 2:
                                    Teacher p1 = getTeacher(sa);
                                    managerPerson.add(p1);
                                    managerPerson.print();
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1.edit to student");
                        System.out.println("2.edit to teacher");
                        numcheck2 = sa.nextInt();
                        if (numcheck2 != 0) {
                            switch (numcheck2) {
                                case 1:
                                    System.out.println("Enter the person ID to edit: ");
                                    int iid = sa.nextInt();
                                    if (managerPerson.check(iid)) {
                                        Studen sas = getStudene(sa, iid);
                                        managerPerson.edit(iid, sas);
                                        managerPerson.print();
                                    } else {
                                        System.out.println("This item is not available");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the person ID to edit: ");
                                    iid = sa.nextInt();
                                    if (managerPerson.check(iid)) {
                                        Teacher s = getTeachere(sa, iid);
                                        managerPerson.edit(iid, s);
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
                        int idf = sa.nextInt();
                        if (managerPerson.check(idf)) {
                            managerPerson.delete(idf);
                            managerPerson.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the person ID to Find: ");
                        int id = sa.nextInt();
                        if (managerPerson.check(id)) {
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

    private static Studen getStuden(Scanner sa) {
        sa.nextLine();
        System.out.println("Enter information New studen: ");
        System.out.print("Name: ");
        String name = sa.nextLine();
        System.out.print("Age: ");
        int age = sa.nextInt();
        int id = idd++;
        System.out.print("Score: ");
        double score = sa.nextDouble();
        Studen p = new Studen(name, age, score, id);
        return p;
    }

    private static Teacher getTeacher(Scanner sa) {
        int id;
        String name;
        int age;
        sa.nextLine();
        System.out.println("Enter information New studen: ");
        System.out.print("Name: ");
        name = sa.nextLine();
        System.out.print("Age: ");
        age = sa.nextInt();
        System.out.print("subjects: ");
        sa.nextLine();
        String subjects = sa.nextLine();
        id = idd++;
        Teacher p1 = new Teacher(name, age, id, subjects);
        return p1;
    }

    private static Studen getStudene(Scanner sa, int iid) {
        sa.nextLine();
        System.out.println("Enter information New person: ");
        System.out.print("Name: ");
        String name = sa.nextLine();
        System.out.print("Age: ");
        int age = sa.nextInt();
        System.out.print("Score:");
        double score = sa.nextDouble();
        Studen sas = new Studen(name, age, score, iid);
        return sas;
    }

    private static Teacher getTeachere(Scanner sa, int iid) {
        sa.nextLine();
        System.out.println("Enter information New person: ");
        System.out.print("Name: ");
        String name = sa.nextLine();
        System.out.print("Age: ");
        int age = sa.nextInt();
        System.out.print("subjects: ");
        sa.nextLine();
        String subjects = sa.nextLine();
        Teacher s = new Teacher(name, age, iid, subjects);
        return s;
    }
}
