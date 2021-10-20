package miniTest;

import miniTest.main.ManagerPerson;
import miniTest.model.Person;

import java.util.Scanner;

public class MainMenuPerson {
    public static int idd=1;
    public static void main(String[] args) {
        ManagerPerson ma = new ManagerPerson();
        int se = -1;
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
            se = sa.nextInt();
            if (se != 0) {
                switch (se) {
                    case 1:
                        sa.nextLine();
                        System.out.println("Enter information New person: ");
                        System.out.print("Name: ");
                        String name = sa.nextLine();
                        System.out.print("Age: ");
                        int age = sa.nextInt();
//                        System.out.print("ID: ");
                        int id = idd++;
                        Person p = new Person(name, age,id);
                        ma.add(p);
                        ma.print();
                        break;
                    case 2:
                        System.out.println("Enter the person ID to edit: ");
                        int iid = sa.nextInt();
                        if (ma.che(iid)) {
                            sa.nextLine();
                            System.out.println("Enter information New person: ");
                            System.out.print("Name: ");
                            name = sa.nextLine();
//                            System.out.print("ID: ");
                            System.out.print("Age: ");
                            age = sa.nextInt();
                            Person s = new Person(name, age,iid);
                            ma.edit(iid, s);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the person ID to delete: ");
                        int idf = sa.nextInt();
                        if (ma.che(idf)) {
                            ma.delete(idf);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the person ID to Find: ");
                        id = sa.nextInt();
                        if (ma.che(id)) {
                            ma.printId(ma.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List person: ");
                        ma.print();
                        break;

                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (se != 0);
    }
}
