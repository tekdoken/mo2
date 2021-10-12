package bai3;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = sa.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        int[] ma=new int[size];
        int i = 0;
        while (i < ma.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            ma[i] = sa.nextInt();
            i++;
        }
        int c=0;
        for(int x: ma){
            if (x>=5&&x<=10){
                c++;
            }
        }
        System.out.println("so sinh vien do la: "+c);
    }
}
