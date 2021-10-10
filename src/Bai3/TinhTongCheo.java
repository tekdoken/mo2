package Bai3;

import java.util.Scanner;

public class TinhTongCheo {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("nhap so dong: ");
        int d = sa.nextInt();
        int c =d;
        double[][] n = new double[d][c];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print("nhap gia tri dong " + (i + 1) + " cot " + (j + 1) + ":");
                int in = sa.nextInt();
                n[i][j] = in;
            }
        }
        int to=0;
        for(int i=0;i<n.length;i++){
            to+=n[i][i];
        }
        System.out.println(to);
    }
}
