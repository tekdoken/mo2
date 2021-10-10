package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanMang {
    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6};
        System.out.print("nhap gia tri can xoa: ");
        Scanner sa = new Scanner(System.in);
        int x = sa.nextInt();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == (x)) {
                for (int j = i; j < n.length - 1; j++) {
                    n[j] = n[j + 1];
                }
                n[n.length - 1] =0;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
