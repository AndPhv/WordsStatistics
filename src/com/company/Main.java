package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String text = "Hello hello java Java world";
        String[] words = text.split(" ");
        System.out.println(getStatisticMap(words));
    }
    private static Map<String, Integer> getStatisticMap(String[] words) {
        Map<String, Integer> wordsCountMap = new HashMap<String, Integer>();
        for (String word : words) {
            String w = word.toLowerCase();
            Integer count = wordsCountMap.get(w);
            if (count == null)
                count = 1;
            else
                count += 1;
            wordsCountMap.put(w, count);
        }
        return sort(Collections.unmodifiableMap(wordsCountMap));
    }
    private static Map<String, Integer> sort(Map<String, Integer> original) {

    }
}
