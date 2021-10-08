package bai2;

import java.util.Scanner;

public class Uoc_so {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("nhap so nguyen a: ");
        int a = sa.nextInt();
        System.out.println("nhap so nguyen b: ");
        int b = sa.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("ko co uoc chung lon nhat");
        }
        while (a!=b){
            if(a>b)
               a=a-b;
            else
                b=b-a;
        }
        System.out.println("uoc lon nhat la: "+a);
    }
}
