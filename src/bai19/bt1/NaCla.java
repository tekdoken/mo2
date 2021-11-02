package bai19.bt1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaCla {
    private static final String NAME_CLASS = "^[A,C,P][0-9]{4}[ G, H, I, K, L, M]$";


    public NaCla() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}