package bai12.product;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ManagerProduct ma = new ManagerProduct();
        Product p1 = new Product("aaa", 2, 111);
        ma.add(p1);
        int se = -1;
        do {
            Scanner sa = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Find Product");
            System.out.println("5. Print Product");
            System.out.println("6. Sort in descending order ");
            System.out.println("7. Sort in ascending order ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            se = sa.nextInt();
            if (se != 0) {
                switch (se) {
                    case 1:
                        sa.nextLine();
                        System.out.println("Enter information New Product: ");
                        System.out.print("Name: ");
                        String name = sa.nextLine();
                        System.out.print("ID: ");
                        int id = sa.nextInt();
                        System.out.print("Price: ");
                        int price = sa.nextInt();
                        Product p = new Product(name, id, price);
                        ma.add(p);
                        ma.print();
                        break;
                    case 2:
                        System.out.println("Enter the product ID to edit: ");
                        int iid = sa.nextInt();
                        if (ma.che(iid)) {
                            sa.nextLine();
                            System.out.println("Enter information New Product: ");
                            System.out.print("Name: ");
                            name = sa.nextLine();
                            System.out.print("ID: ");
                            id = sa.nextInt();
                            System.out.print("Price: ");
                            price = sa.nextInt();
                            p = new Product(name, id, price);
                            ma.edit(iid, p);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }

                        break;
                    case 3:
                        id = sa.nextInt();
                        System.out.println("Enter the product ID to delete: ");
                        id = sa.nextInt();
                        if (ma.che(id)) {
                            ma.delete(id);
                            ma.print();
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 4:
                        System.out.println("Enter the product ID to Find: ");
                        id = sa.nextInt();
                        if (ma.che(id)) {
                            ma.printId(ma.find(id));
                        } else {
                            System.out.println("This item is not available");
                        }
                        break;
                    case 5:
                        System.out.println("List Product: ");
                        ma.print();
                        break;
                    case 6:
                        System.out.println("Sort in descending order");
                        ma.sortg();
                        break;
                    case 7:
                        System.out.println("Sort in ascending order");
                        ma.sorta();
                        break;
                    default:
                        System.out.println("This item is not available");
                }
            }
        } while (se != 0);
    }
}
