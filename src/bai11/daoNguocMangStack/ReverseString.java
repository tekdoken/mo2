package bai11.daoNguocMangStack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ko biet lam";
        Stack<String> st = new Stack();
        String[] words = str.split("\\s");
        for (String w : words
        ) {
            st.push(w);
        }
        str = "";
        for (int i = 0; i < words.length; i++) {
            str += " "+st.pop();
        }
        System.out.println(str);
    }
}
