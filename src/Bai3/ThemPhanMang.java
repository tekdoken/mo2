package Bai3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanMang {
    public static void main(String[] args) {
        int[] n = {2, 3, 4, 5, 6, 0};
        Scanner sa = new Scanner(System.in);
        System.out.println("nhap gia tri can them: ");
        int t = sa.nextInt();
        System.out.println("nhap vi tri(bat dau tu 0): ");
        int v = sa.nextInt();
        int temp = 0;
        for (int i = 0; i < n.length; i++) {
            if (i == v) {
                for (int j = n.length - 1; j > i; j--) {
                    temp = n[j - 1];
                    n[j] = temp;
                }
                n[i] = t;
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
