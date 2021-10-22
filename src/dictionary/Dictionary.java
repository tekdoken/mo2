package dictionary;

import java.util.Locale;

public class Dictionary {
    private String english;
    private String vietnam;

    public Dictionary(String english, String vietnam) {
        this.english = check(english);
        this.vietnam = check(vietnam);

    }

    public static String check(String a){
        String a2 = null;
        a2 = a.toLowerCase().trim();
        return a2;
    }
    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getVietnam() {
        return vietnam;
    }

    public void setVietnam(String vietnam) {
        this.vietnam = vietnam;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "english='" + english + '\'' +
                ", vietnam='" + vietnam + '\'' +
                '}';
    }

    public void put(Dictionary dictionary1) {
    }
}
