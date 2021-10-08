package bai2;

import java.util.Scanner;

public class h100songuyento {
    public static void main(String[] args) {
     int n;
     for (n=2;n<100;n++){
         boolean check=true;
         for(int i=2;i*i<=n;i++){
             if (n%i==0){
                 check=false;
                 break;
             }
         }if (check){
             System.out.println(n);
         }
     }
    }
}

