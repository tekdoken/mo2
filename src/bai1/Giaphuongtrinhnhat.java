package bai1;

import java.util.Scanner;

public class Giaphuongtrinhnhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner sa = new Scanner(System.in);
        System.out.print("a: ");
        double a = sa.nextDouble();

        System.out.print("b: ");
        double b = sa.nextDouble();

        System.out.print("c: ");
        double c = sa.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %.2f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
