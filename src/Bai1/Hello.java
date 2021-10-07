package Bai1;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.print("nhap ten: ");
        Scanner sa=new Scanner(System.in);
        String name=sa.nextLine();
        System.out.println("hello "+name);
    }
}
