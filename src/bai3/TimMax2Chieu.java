package bai3;

import java.util.Scanner;

public class TimMax2Chieu {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("nhap so dong: ");
        int d = sa.nextInt();
        System.out.print("nhap so cot: ");
        int c = sa.nextInt();
        double[][] n = new double[d][c];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("nhap gia tri dong " + (i + 1) + " cot "+(j+1)+":");
                int in = sa.nextInt();
                n[i][j]=in;
            }
        }
        double max = n[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (max < n[i][j]) {
                    max = n[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("GTLN la: " + max  + " dong " + (index1 + 1)+ " va cot " + (index2 + 1));
    }
}
