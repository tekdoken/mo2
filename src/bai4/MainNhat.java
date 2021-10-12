package bai4;

import java.util.Scanner;

public class MainNhat {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        double width = sa.nextDouble();
        System.out.print("nhap chieu rong:");
        double height = sa.nextDouble();
        Nhat nhat = new Nhat(width, height);
        System.out.println(nhat.display());
        System.out.println("chu vi: " + nhat.chuVi());
        System.out.println("dien tich: " + nhat.dienTich());
    }
}