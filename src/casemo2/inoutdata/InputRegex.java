package casemo2.inoutdata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputRegex {
    private static final String ACCOUNT_REGEX = "^\\S+$";
    private static final String PASS_REGEX = "^\\S+$";
    private static final String NAME_REGEX = "^\\S?(.+)+\\S?$";

    public InputRegex() {
    }

    public boolean Acc(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean Pass(String regex) {
        Pattern pattern = Pattern.compile(PASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean Name(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
