package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("enter book list: ");
        int lb=sa.nextInt();
        Book[] listBook = new Book[lb];
        input(listBook);
        output(listBook);
        totalPrice(listBook);
        searchBook(listBook);
    }

    public static void input(Book[] listBook) {
        for (int i = 0; i < listBook.length; i++) {
            Scanner sa = new Scanner(System.in);
            System.out.println("enter information");
            String name = sa.nextLine();
            String category = sa.nextLine();
            String author = sa.nextLine();
            double price = sa.nextDouble();
            int amount = sa.nextInt();
            Book book = new Book(name, price, amount, category, author);
            listBook[i] = book;
        }
    }

    public static void output(Book[] listBook) {
        for (int i = 0; i < listBook.length; i++) {
            System.out.println(listBook[i]);
        }
    }

    public static void totalPrice(Book[] listBook) {
        int t = 0;
        for (int i = 0; i < listBook.length; i++) {
            t += listBook[i].price * listBook[i].amount;
        }
        System.out.println("total price: "+t);
    }

    public static void searchBook(Book[] listBook) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name book");
        String nameb = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i].name.equals(nameb)) {
                check = false;
                System.out.println(listBook[i]);
            }
        }
        if (check) {
            System.out.println("not in the list");
        }
    }
}