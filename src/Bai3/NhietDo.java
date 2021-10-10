package Bai3;

import java.util.Scanner;

public class NhietDo {
    public static void main(String[] args) {
        nhietDo();
    }

    public static void nhietDo() {
        Scanner sa = new Scanner(System.in);
        double c;
        double f;
        int cho;
        do {
            System.out.println("Menu");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            cho = sa.nextInt();
            switch (cho) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    f = sa.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(f));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    c = sa.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(c));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (cho != 0);
    }

    public static double cToF(double c) {
        double f = (9.0 / 5) * c + 32;
        return f;
    }

    public static double fToC(double f) {
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
}
        