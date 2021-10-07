package Bai1.CheckTriangle;


import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");

        a = sc.nextInt();
        System.out.print("Nhập b: ");
        b = sc.nextInt();
        System.out.print("Nhập c: ");
        c = sc.nextInt();
        checkTriangle(a, b, c);


    }

    public static void checkTriangle(int a, int b, int c) {
        boolean isGreaterThanZero = a > 0 && b > 0 && c > 0;
        boolean isTriangle = a + b > c && b + c > a && c + a > b;
        boolean isIsoscelesTriangle = a == b || b == c || c == a;
        boolean isEquilateralTriangle = a == b && b == c;
        if (isGreaterThanZero && isTriangle) {
            if (isEquilateralTriangle) {
                System.out.println("đây là tam giác đều");
            } else if (isIsoscelesTriangle) {
                System.out.println("đây là tam giác cân");
            } else {
                System.out.println("đây là tam giác");
            }
        } else {
            System.out.println("đây ko phải tam giác");
        }
    }
}
