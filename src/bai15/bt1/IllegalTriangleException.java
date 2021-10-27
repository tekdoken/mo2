package bai15.bt1;

import java.util.Scanner;

public class IllegalTriangleException {
    private void triangle(double a, double b, double c) {
        if (checkTriangle(a, b, c)) {
            System.out.println("s");
        } else {
            throw new IllegalArgumentException("ko phai tam giac");
        }
    }
    private boolean checkTriangle(double a, double b, double c) {
        return a + b > c || a + c > b || c + b > a && a > 0 & b > 0 && c > 0;
    }
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("aa");
            double a = s.nextDouble();
            double b = s.nextDouble();
            double c = s.nextDouble();
            IllegalTriangleException t = new IllegalTriangleException();
            t.triangle(a, b, c);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }


}
