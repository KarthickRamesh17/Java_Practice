package com.interviewQ;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        String input = "Hi i am karthick hi";

        String[] words = input.toLowerCase().split(" ");
        for(String word: words)
        {
            map.put(word, map.getOrDefault(word,0) + 1);
        }
        for(Map.Entry<String,Integer> val: map.entrySet())
        {
            if(val.getValue() == 1)
            {
                System.out.println(val.getKey());
            }
        }

    }
}
