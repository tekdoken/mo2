package Bai2;

import java.util.Scanner;

public class Tinhlai {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("nhap so tien gui: ");
        double tien = sa.nextDouble();
        System.out.print("phan tram lai: ");
        double ptl = sa.nextDouble();
        System.out.print("nhap so thang: ");
        int thang = sa.nextInt();
        double lai = 0;
        for (int i = 0; i < thang; i++) {
            lai += tien * (ptl / 100) / 12;
        }
        System.out.println("tong tien lai la: "+lai);
    }
}
