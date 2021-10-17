package bai7.Resizeable;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        Resizeable resizeable= rectangle;
//        System.out.println("tang size ngau nhien: ");
//        resizeable.resizeRan();
        System.out.println("tang size ti le phan tram: ");
        Scanner sa=new Scanner(System.in);
        double a= sa.nextDouble();
        resizeable.resize(a);
    }
}
