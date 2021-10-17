package bai7.Resizeable;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(500);
        System.out.println(circle);

        circle = new Circle(500, "indigo", false);
        System.out.println(circle);
        Resizeable resizeable= circle;
//        System.out.println("tang size ngau nhien: ");
//        resizeable.resizeRan();
        System.out.println("tang size ti le phan tram: ");
        Scanner sa=new Scanner(System.in);
        double a= sa.nextDouble();
        resizeable.resize(a);
    }
}
