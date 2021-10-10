package Bai2;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        Scanner sa=new Scanner(System.in);
        int nhap = sa.nextInt();
        int n = 2;
        int c = 0;
        while (c < nhap) {
            boolean check = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                c++;
            }
            n++;
        }
    }
}
