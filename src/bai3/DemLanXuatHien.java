package bai3;

import java.util.Scanner;

public class DemLanXuatHien {
    public static void main(String[] args) {
        Scanner sa= new Scanner(System.in);
        String s="manafa";
        String cs=sa.nextLine();
        char[] ch =cs.toCharArray();
        char[] str=s.toCharArray();
        int c=0;
        for(int i=0;i<str.length;i++){
            if(ch[0]==str[i]){
                c++;
            }
        }
        System.out.println(c);
    }
}
