package bai2;

import java.util.Scanner;

public class Vemenu {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner sa = new Scanner(System.in);
        int chon = sa.nextInt();

        switch (chon) {
            case 1:
                System.out.println("ve tam giac");
               for (int i=6;i>=1;i--){
                   for(int j=0; j<i; j++){
                       System.out.print("*  ");
                   }
                   System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("ve vuong");
                for (int a = 0; a < 6; a++) {
                    for (int s = 0; s < 6; s++) {
                        System.out.print("*  ");
                    }
                    System.out.print("\n");
                }
                break;

        }
    }
}
