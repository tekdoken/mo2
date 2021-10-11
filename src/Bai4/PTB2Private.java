package Bai4;

import java.util.Scanner;

public class PTB2Private {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        double a = sa.nextDouble();
        double b = sa.nextDouble();
        double c = sa.nextDouble();
        PTB2Private ptb2 = new PTB2Private(a, b, c);

        if (ptb2.getDiscriminant() >= 0) {
            if (ptb2.getDiscriminant() == 0) {
                System.out.println(ptb2.getRoot1());
            } else {
                System.out.println(ptb2.getRoot1() + "and" + ptb2.getRoot2());
            }
        } else {
            System.out.println("The equation has no roots");
        }
    }

    private double a1, b1, c1;

    public double a(){
        return a1;
    }public double b(){
        return b1;
    }public double c(){
        return c1;
    }
    public PTB2Private(double a, double b, double c) {
        this.a1 = a;
        this.b1 = b;
        this.c1 = c;
    }

    public double getDiscriminant() {
        double delta = b() * 2 - 4 * a() * c();
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b() + (Math.pow((b() * b() - (4 * a() * c())), 0.5))) / (2 * a());
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b() - (Math.pow((b()* b() - (4 * a() * c())), 0.5))) / (2 * a());
        return r2;
    }
}
