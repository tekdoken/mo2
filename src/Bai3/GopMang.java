package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] n1 = new int[3];
        int[] n2 = new int[4];
        Scanner sa = new Scanner(System.in);
        for (int i = 0; i < n1.length; i++) {
            System.out.print("nhap gia tri so "+(i+1)+" cua mang 1: ");
            int in1 = sa.nextInt();
            n1[i] =in1;
        }
        for (int i = 0; i < n2.length; i++) {
            System.out.print("nhap gia tri so " + (i + 1) + " cua mang 2: ");
            int in2 = sa.nextInt();
            n2[i] = in2;
        }
        int [] n3=new int[n1.length+ n2.length];
        for(int i=0;i<n1.length;i++){
            n3[i]=n1[i];
        }
        for(int i=0;i<n2.length;i++){
            n3[n1.length+i]=n2[i];
        }
        System.out.println(Arrays.toString(n3));
    }
}
