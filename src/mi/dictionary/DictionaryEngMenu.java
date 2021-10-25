package mi.dictionary;

import java.util.Scanner;

public class DictionaryEngMenu {
    public static void main(String[] args) {
        Dictonary dictonary = new Dictonary();

        int select = -1;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Total Score ");
            System.out.println("3. Delete Student");
            System.out.println("4. Find Student");
            System.out.println("5. Print Student");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            select = sc.nextInt();
            sc.nextLine();
            if (select != 0) {
                switch (select) {
                    case 1:

                }
            }
        } while (select != 0);
    }
}

