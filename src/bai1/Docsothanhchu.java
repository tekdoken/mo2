package bai1;

import java.util.Scanner;

public class Docsothanhchu {
    public static void main(String[] args) {
        System.out.println("nhap so: ");
        String[] ma={"mươi","một","hai","ba","bốn","năm","sáu","bảy","tám","chín"};
        Scanner sa=new Scanner(System.in);
        System.out.println(ma[sa.nextInt()]);
    }
}
