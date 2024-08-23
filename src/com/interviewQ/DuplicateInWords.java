package com.interviewQ;
/*
String str = "I am doing an interview at EY I work for EY";
Output -> I EY (Duplicate)
Output -> I am doing an interview at EY work for (Unique)
Output -> am doing an interview at work for (Removed Duplicates)*/

import java.util.*;

public class DuplicateInWords {
    static String duplicatedWords(String str)
    {

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        String[] words = str.split(" ");

        for(String word: words)
        {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<String,Integer> val: map.entrySet())
        {
            if(val.getValue() > 1)
            {
                if(!result.isEmpty())
                {
                    result.append(" ");
                }
                result.append(val.getKey());
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "I am doing an interview at EY I work for EY";
        String answer = duplicatedWords(str);
        System.out.println(answer);
    }
}
