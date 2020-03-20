package rocks.zipcode.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    String[] words;
    public WordCounter(String... strings) {
        words = strings;
    }

    public Map<String, Integer> getWordCountMap() {
        HashMap<String,Integer> map = new HashMap<>();
        for (String s: words) {
            map.compute(s,(k,v) -> (v == null) ? 1: v+1);
            //whoa
        }
        return map;
    }
}
