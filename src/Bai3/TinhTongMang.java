package Bai3;

import java.util.Scanner;

public class TinhTongMang {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("nhap so dong: ");
        int d = sa.nextInt();
        System.out.print("nhap so cot: ");
        int c = sa.nextInt();
        double[][] n = new double[d][c];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("nhap gia tri dong " + (i + 1) + " cot " + (j + 1) + ":");
                int in = sa.nextInt();
                n[i][j] = in;
            }
        }
        System.out.println("nhap cot muon thinh tong:");
        int f= sa.nextInt();
        int to=0;
        for (int i = 0; i < n.length; i++) {
            to+=n[i][f];
        }
        System.out.println(to);
    }
}
