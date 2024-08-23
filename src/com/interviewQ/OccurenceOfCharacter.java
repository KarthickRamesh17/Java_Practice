package com.interviewQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceOfCharacter {

    static void characterCount(String inputString)
    {
        List<Character> strlist = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        char[] charArr = inputString.toCharArray();
        for(char a: charArr)
        {
            if(map.containsKey(a))
            {
                map.put(a, map.get(a) + 1);
            }
            else {
                map.put(a, 1);
            }

        }
        for (Map.Entry<Character,Integer> iter: map.entrySet() )
        {
            if(iter.getValue() > 1)
            {
                strlist.add(iter.getKey());
            }
        }
        System.out.println(strlist.toString());
    }

    public static void main(String[] args) {

        //OccurenceOfCharacter obj = new OccurenceOfCharacter();
        String str = "Ajiti";
        characterCount(str);
    }
}
