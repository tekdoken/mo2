package Bai2;

import java.util.Scanner;

public class Hienthiloaihinh {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        Scanner sa = new Scanner(System.in);
        int chon = sa.nextInt();
        switch (chon) {
            case 1:
                System.out.println(" chu nhat");

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println(" tam giac vuong");
                for (int i = 1; i <= 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
                for (int i = 6; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("tam giac can");
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5 - i; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
