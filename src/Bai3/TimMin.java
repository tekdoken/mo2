package Bai3;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int z =sa.nextInt();
        int[] n=new int[z];
        for(int i=0;i<n.length;i++){
            System.out.print("nhap gia tri so "+(i+1)+" cua mang");
            n[i]=sa.nextInt();
        }
        System.out.println("gia tri nho nhat cua mang la: "+Min.min(n));
    }
}
