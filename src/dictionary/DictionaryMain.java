package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary("one", "mot");
        Dictionary dictionary2 = new Dictionary("two", "hai");
        Dictionary dictionary3 = new Dictionary("three", "ba");
        Dictionary dictionary4 = new Dictionary("four", "bon");
        Dictionary dictionary5 = new Dictionary("five", "nam");
        Dictionary dictionary6 = new Dictionary("six", "sau");
        Dictionary dictionary7 = new Dictionary("seven", "bay");
        Dictionary dictionary8 = new Dictionary("eight", "tam");
        Map<String, Dictionary> dictionaryHashMap = new HashMap<String, Dictionary>();
        dictionaryHashMap.put("one",dictionary1);
        dictionaryHashMap.put("two",dictionary2);
        dictionaryHashMap.put("three",dictionary3);
        dictionaryHashMap.put("four",dictionary4);
        dictionaryHashMap.put("five",dictionary5);
        dictionaryHashMap.put("six",dictionary6);
        dictionaryHashMap.put("seven",dictionary7);
        dictionaryHashMap.put("eight",dictionary8);
        String enterEnhlish = getEnterEnglish();
        checkKey(dictionaryHashMap, enterEnhlish);
    }

    private static String getEnterEnglish() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter English world");
        String enterEnhlish=scanner.nextLine();
        return enterEnhlish;
    }

    private static void checkKey(Map<String, Dictionary> dictionaryHashMap, String enterEnhlish) {
        if(dictionaryHashMap.containsKey(enterEnhlish)){
            System.out.println(dictionaryHashMap.get(enterEnhlish));

        }else{
            System.out.println("This item is not available ");
        }
    }
}
