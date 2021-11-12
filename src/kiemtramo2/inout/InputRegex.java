package kiemtramo2.inout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputRegex {
    private static final String NUMBER_PHONE_REGEX = "^[0-9]{9,}$";
    private static final String NAME_REGEX = "^\\S?(.+)+\\S?$";
    private static final String BIRTHDAY_REGEX = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public InputRegex() {
    }

    public boolean Name(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean NumPhone(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean Birthday(String regex) {
        Pattern pattern = Pattern.compile(BIRTHDAY_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean Email(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
