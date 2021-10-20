package miniTest;

import miniTest.main.ManagerPerson;
import miniTest.model.Person;
import miniTest.model.Studen;
import miniTest.model.Teacher;

import java.util.Scanner;

public class MainMenuPerson {
    public static int idd = 1;

    public static void main(String[] args) {
        ManagerPerson ma = new ManagerPerson();
        int se = -1;
        int ss = -1;
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
                        System.out.println("1.student");
                        System.out.println("2.teacher");
                        ss = sa.nextInt();
                        if (ss != 0) {
                            switch (ss) {
                                case 1:
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
                                    ma.add(p);
                                    ma.print();
                                    break;
                                case 2:
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
                                    ma.add(p1);
                                    ma.print();
                                    break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("1.edit to student");
                        System.out.println("2.edit to teacher");
                        ss = sa.nextInt();
                        if (ss != 0) {
                            switch (ss) {
                                case 1:
                                    System.out.println("Enter the person ID to edit: ");
                                    int iid = sa.nextInt();
                                    if (ma.che(iid)) {
                                        sa.nextLine();
                                        System.out.println("Enter information New person: ");
                                        System.out.print("Name: ");
                                        String name = sa.nextLine();
                                        System.out.print("Age: ");
                                        int age = sa.nextInt();
                                        System.out.println("Score:");
                                        double score = sa.nextDouble();
                                        Studen s = new Studen(name, age, score, iid);
                                        ma.edit(iid, s);
                                        ma.print();
                                    } else {
                                        System.out.println("This item is not available");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the person ID to edit: ");
                                    iid = sa.nextInt();
                                    if (ma.che(iid)) {
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
                                        ma.edit(iid, s);
                                        ma.print();
                                    } else {
                                        System.out.println("This item is not available");
                                    }
                                    break;
                            }
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
                        int id = sa.nextInt();
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
        }
        while (se != 0);
    }
}
