package com.interviewQ;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void nonDuplicate(String str)
    {
        StringBuilder stri = new StringBuilder();
        char[] ans = new char[str.length()];
        int x=0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] charArr = str.toCharArray();
        for(char i: charArr)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.getOrDefault(i,0) + 1);
            }
            else
            {
                map.put(i,1);
            }
        }

        for(Map.Entry<Character,Integer> val: map.entrySet())
        {

            if(val.getValue() <=1)
            {
               stri.append(val.getKey());
            }

        }
        System.out.println(stri);



    }
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        String input = "TEST";

        nonDuplicate(input);

    }
}
