package com.interviewQ;

import java.util.*;

public class CountWords {
    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        List<String> list = new ArrayList<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            list.add(word);


        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        return wordCount;
    }
    public static void main(String[] args) {
        String input = "Hai this is an example";
        Map<String,Integer> x = countWords(input);
        System.out.println(x);
    }
}
