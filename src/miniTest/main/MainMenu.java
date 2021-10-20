package miniTest.main;

import miniTest.model.Studen;

import java.util.Scanner;

public class MainMenu {
    public static int idd=1;
    public static void main(String[] args) {
        ManagerStuden ma = new ManagerStuden();
        int se = -1;
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
            se = sa.nextInt();
            if (se != 0) {
                switch (se) {
                    case 1:
                        sa.nextLine();
                        System.out.println("Enter information New studen: ");
                        System.out.print("Name: ");
                        String name = sa.nextLine();
                        System.out.print("Age: ");
                        int age = sa.nextInt();
//                        System.out.print("ID: ");
                        int id = idd++;
                        System.out.print("Score: ");
                        double score = sa.nextDouble();
                        Studen p = new Studen(name, age, score,id);
                        ma.add(p);
                        ma.print();
                        break;
                    case 2:
                        System.out.println("Enter the studen ID to edit: ");
                        int iid = sa.nextInt();
                        if (ma.che(iid)) {
                            sa.nextLine();
                            System.out.println("Enter information New studen: ");
                            System.out.print("Name: ");
                            name = sa.nextLine();
//                            System.out.print("ID: ");
                            System.out.print("Age: ");
                            age = sa.nextInt();
                            System.out.print("Score: ");
                            score = sa.nextDouble();
                            Studen s = new Studen(name, age,  score,iid);
                            ma.edit(iid, s);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 3:
                        System.out.println("Enter the studen ID to delete: ");
                        int idf = sa.nextInt();
                        if (ma.che(idf)) {
                            ma.delete(idf);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the studen ID to Find: ");
                        id = sa.nextInt();
                        if (ma.che(id)) {
                            ma.printId(ma.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List Studen: ");
                        ma.print();
                        break;
                    case 6:
                        System.out.println("Sort in descending order");
                        ma.sortg();
                        ma.print();
                        break;
                    case 7:
                        System.out.println("Sort in ascending order");
                        ma.sorta();
                        ma.print();
                        break;
                    case 8:
                        ma.getTotalScore();
                        break;
                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (se != 0);
    }
}
