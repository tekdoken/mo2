package bai11.daoNguocMangStack;

import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Stack<Integer> st = new Stack<>();
        for (int i :arr) {
            st.push(i);
        }
        for (int i = 0; i< arr.length ; i++) {
            arr[i]=st.pop();
        System.out.println(arr[i]);
        }
    }
}
