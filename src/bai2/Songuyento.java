package bai2;

import java.util.Scanner;

public class Songuyento {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("nhap so");
        int so = sa.nextInt();
        if (so < 2) {
            System.out.println("ko phai so nguyen to");
        } else {
            int i = 2;
            boolean c = true;
            while (i < so) {
                if (so % i == 0) {
                    c = false;
                    break;
                }
                i++;
            }
            if (c) {
                System.out.println(so + " la so nguyen to");
            } else {
                System.out.println( so+" ko phai so nguyen to");
            }
        }
    }
}
