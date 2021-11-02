package bai19.bt2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumPhone {
    private static final String NUM_PHONE = "^[0-9]{2}-[0-9]{9}$";


    public NumPhone() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NUM_PHONE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
