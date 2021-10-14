package bai6;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Nhập side1: ");
        double s1 = sa.nextDouble();
        System.out.print("Nhập side2: ");
        double s2 = sa.nextDouble();
        System.out.print("Nhập side3: ");
        double s3 = sa.nextDouble();
        System.out.print("Nhập color: ");
        sa.nextLine();
        String c= sa.nextLine();
        checkTriangle(s1,s2,s3,c);
    }
    public static void checkTriangle ( double a, double b, double c,String color){
        boolean isTriangle = a + b > c && b + c > a && c + a > b;
        if (isTriangle) {
            Triangle triangle = new Triangle();
            triangle.setSide123(a, b, c,color);
            System.out.println(triangle);
        }else{
            System.out.println("is not triangle");
        }

    }
}
