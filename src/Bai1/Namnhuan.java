package Bai1;

import java.util.Scanner;

public class Namnhuan {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = sa.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}


