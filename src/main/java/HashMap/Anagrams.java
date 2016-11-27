package main.java.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    private static HashMap<String, List<String>> map = new HashMap<String, List<String>>()   ;
    public static void preCompute(List<String> englishDictionary) {
        for (String word : englishDictionary) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sortedWord = String.valueOf(letters);
            if (map.get(sortedWord) != null) {
                map.get(sortedWord).add(word);
            } else {
                List<String> words = new ArrayList<String>();
                words.add(word);
                map.put(sortedWord, words);
            }
        }
    }
    public static List<String> getAnagrams(String input) {
        char[] letters = input.toCharArray();
        Arrays.sort(letters);
        return map.get(String.valueOf(letters));
    }
}
