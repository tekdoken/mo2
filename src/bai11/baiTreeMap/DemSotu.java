package bai11.baiTreeMap;

import java.util.Set;
import java.util.TreeMap;

public class DemSotu {
    public static void main(String[] args) {
        String str="van ko biet lam";
        TreeMap<Character,Integer> tree =new TreeMap<>();
        String up=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            if(!tree.containsKey(up.charAt(i))){
                tree.put(up.charAt(i),1);
            }else{
                tree.put(up.charAt(i), tree.get(up.charAt(i))+1);
            }
        }
        Set<Character> keySet = tree.keySet();
        for (Character key : keySet) {
            System.out.println(key + " : " + tree.get(key));
        }
    }
}
