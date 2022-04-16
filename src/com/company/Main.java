package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String text = "Hello hello java Java world hello";
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
        Set<Map.Entry<String, Integer>> set = new TreeSet<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });

        for (Map.Entry<Integer, String> entry : ) {
            result.put(entry.getValue(), entry.getKey());
        }
        return Collections.unmodifiableMap(result);
    }
}
