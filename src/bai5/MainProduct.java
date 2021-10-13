package bai5;

import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("enter product quantity: ");
        int pr = sa.nextInt();
        Product[] listProduct = new Product[pr];
        input(listProduct);
        output(listProduct);
        totalPrice(listProduct);
        searchPro(listProduct);
        editPro(listProduct);
        delete(listProduct);
    }

    public static void input(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            Scanner sa = new Scanner(System.in);
            System.out.println("enter information");
            System.out.println("enter name");
            String name = sa.nextLine();
            System.out.println("enter code");
            int code = sa.nextInt();
            System.out.println("enter price");
            double price = sa.nextDouble();
            System.out.println("enter category");
            sa.nextLine();
            String category = sa.nextLine();
            System.out.println("enter unit");
            String unit = sa.nextLine();
            if (unit.equals("")) {
                unit = "USD";
            }
            Product product = new Product(name, code, price, category, unit);
            listProduct[i] = product;
        }
    }

    public static void output(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            System.out.println(listProduct[i]);
        }
    }

    public static void totalPrice(Product[] listProduct) {
        int t = 0;
        for (int i = 0; i < listProduct.length; i++) {
            t += listProduct[i].price;
        }
        System.out.println("total price: " + t);
    }

    public static void searchPro(Product[] listProduct) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name product");
        String nameb = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].name.equals(nameb)) {
                check = false;
                System.out.println(listProduct[i]);
            }
        }
        if (check) {
            System.out.println("not in the list");
        }
    }

    public static void editPro(Product[] listProduct) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code you want to edit");
        String codep = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].name.equals(codep)) {
                check = false;
                System.out.println(listProduct[i]);
                Scanner sa = new Scanner(System.in);
                System.out.println("enter information");
                System.out.println("enter name");
                String name = sa.nextLine();
                System.out.println("enter code");
                int code = sa.nextInt();
                System.out.println("enter price");
                double price = sa.nextDouble();
                System.out.println("enter category");
                sa.nextLine();
                String category = sa.nextLine();
                System.out.println("enter unit");
                String unit = sa.nextLine();
                if (unit.equals("")) {
                    unit = "USD";
                }
                Product product = new Product(name, code, price, category, unit);
                listProduct[i] = product;
                for (int j = 0; j < listProduct.length; j++) {
                    System.out.println(listProduct[j]);
                }
            }
        }
        if (check) {
            System.out.println("not in the list");
        }
    }

    public static void delete(Product[] listProduct) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code you want to delete");
        String codep = sc.nextLine();
        for (int i = 0; i < listProduct.length; i++) {
            if (!listProduct[i].name.equals(codep)) {
                System.out.println(listProduct[i]);
            }
        }
    }
}
