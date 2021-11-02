package bai19.bt1;

import bai19.bt1.NaCla;

public class NaClaRun {
    private static NaCla naCla;
    private static final String[] vali = {"C0343G","c9909G","C9G","C8989g"};

    public static void main(String[] args) {
        naCla=new NaCla();
        for (String name:vali
             ) {
            boolean invalid=naCla.validate(name);
            System.out.println(name+":"+invalid);
        }
    }

}
