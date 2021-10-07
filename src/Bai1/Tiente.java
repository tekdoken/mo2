package Bai1;

import java.util.Scanner;

public class Tiente {
    public static void main(String[] args) {
        System.out.println("nhập USD: ");
        Scanner sa = new Scanner(System.in);
        float usd, vnd;
        usd = sa.nextFloat();
        vnd=usd*22705;
        System.out.println(usd+" USD bằng :"+vnd+" VND");
    }
}
