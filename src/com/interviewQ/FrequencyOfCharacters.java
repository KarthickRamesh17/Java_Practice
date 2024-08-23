package com.interviewQ;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    static void freqOfChar(String str)
    {


        HashMap<Character,Integer> map = new HashMap<>();
       // str = str.toLowerCase();
        char[] charArr = str.toCharArray();

        for(char i: charArr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.getOrDefault(i,0)  + 1);
            }
            else {
                map.put(i, 1);
            }
        }
        for(Map.Entry<Character,Integer> val: map.entrySet())
        {
            System.out.println(val.getKey() + " " + val.getValue());
        }
    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        freqOfChar(str);
    }

}
