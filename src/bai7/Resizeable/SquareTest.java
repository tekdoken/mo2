package bai7.Resizeable;

import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        Resizeable resizeable= square;
//        System.out.println("tang size ngau nhien: ");
//        resizeable.resizeRan();
        System.out.println("tang size ti le phan tram: ");
        Scanner sa=new Scanner(System.in);
        double a= sa.nextDouble();
        resizeable.resize(a);
    }
}
