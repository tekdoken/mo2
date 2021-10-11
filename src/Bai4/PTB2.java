package Bai4;

import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        double a = sa.nextDouble();
        double b = sa.nextDouble();
        double c = sa.nextDouble();
        PTB2 ptb2 = new PTB2(a, b, c);

        if (ptb2.getDiscriminant() >= 0) {
            if (ptb2.getDiscriminant() == 0) {
                System.out.println(ptb2.getRoot1());
            }else{
                System.out.println(ptb2.getRoot1()+"and"+ptb2.getRoot2());
            }
        }else{
            System.out.println("The equation has no roots");
        }
    }

    double a, b, c;

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b * 2 - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + (Math.pow((b * b - (4 * a * c)), 0.5))) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - (Math.pow((b * b - (4 * a * c)), 0.5))) / (2 * a);
        return r2;
    }
}
