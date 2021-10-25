package mi.dictionary;

import java.util.*;

public class Dictonary {
    private Map<String, String> word = new HashMap<>();

    public void add(String eng,String vn){
      this.word.put(eng,vn);
    }
    public void delete(String eng){
      this.word.remove(eng);
    }
    public void find(String eng){
      String result=this.word.get(eng);
        System.out.println(result);
    }
    public void printEng(){
        Set<String> wordEng=this.word.keySet();
        System.out.println(Arrays.toString(wordEng.toArray()));
    }

    public void printVn() {
        Set<String> wordVn = (Set<String>) this.word.values();
        System.out.println(Arrays.toString(wordVn.toArray()));
    }

    public void printWord() {
        Set<Map.Entry<String, String>> totalWord = this.word.entrySet();
        System.out.println(Arrays.toString(totalWord.toArray()));
    }
    public int quantityWord(){
        return this.word.size();
    }
    public void reset(){
        this.word.clear();
    }

}
