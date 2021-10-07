package Bai1;

import java.util.Scanner;

public class songaythang {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);

        System.out.print("Which month that you want to count days? ");
        int month = sa.nextInt();
        if (month <= 12) {
            switch (month) {
                case 2:
                    System.out.println("The month '2' has 28 or 29 days!");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("The month " + month + " has 30 days!");
                    break;
                default:
                    System.out.print("The month '" + month + "' has 31 days!");
                    break;
            }
        }else{
            System.out.println("ko có tháng này");
        }
    }
}
