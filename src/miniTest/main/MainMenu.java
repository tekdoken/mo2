package miniTest.main;

import miniTest.model.Studen;

import java.util.Scanner;

public class MainMenu {
    public static int idd = 1;

    public static void main(String[] args) {
        ManagerStuden managerStuden = new ManagerStuden();
        int numcheck = -1;
        do {
            Scanner sa = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add Studen");
            System.out.println("2. Edit Studen");
            System.out.println("3. Delete Studen");
            System.out.println("4. Find Studen");
            System.out.println("5. Print Studen");
            System.out.println("6. Sort in descending order ");
            System.out.println("7. Sort in ascending order ");
            System.out.println("8. Total Score ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            numcheck = sa.nextInt();
            if (numcheck != 0) {
                switch (numcheck) {
                    case 1:
                        Studen p = getStuden(sa);
                        int id;
                        String name;
                        int age;
                        double score;
                        managerStuden.add(p);
                        managerStuden.print();
                        break;
                    case 2:
                        System.out.println("Enter the studen ID to edit: ");
                        int iid = sa.nextInt();
                        if (managerStuden.check(iid)) {
                            Studen s = getStudenre(sa, iid);
                            managerStuden.edit(iid, s);
                            managerStuden.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the studen ID to delete: ");
                        int idf = sa.nextInt();
                        if (managerStuden.check(idf)) {
                            managerStuden.delete(idf);
                            managerStuden.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the studen ID to Find: ");
                        id = sa.nextInt();
                        if (managerStuden.check(id)) {
                            managerStuden.printId(managerStuden.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List Studen: ");
                        managerStuden.print();
                        break;
                    case 6:
                        System.out.println("Sort in descending order");
                        managerStuden.sortg();
                        managerStuden.print();
                        break;
                    case 7:
                        System.out.println("Sort in ascending order");
                        managerStuden.sorta();
                        managerStuden.print();
                        break;
                    case 8:
                        managerStuden.getTotalScore();
                        break;
                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (numcheck != 0);
    }

    private static Studen getStudenre(Scanner sa, int iid) {
        int age;
        double score;
        String name;
        sa.nextLine();
        System.out.println("Enter information New studen: ");
        System.out.print("Name: ");
        name = sa.nextLine();
        System.out.print("Age: ");
        age = sa.nextInt();
        System.out.print("Score: ");
        score = sa.nextDouble();
        Studen s = new Studen(name, age, score, iid);
        return s;
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
}
