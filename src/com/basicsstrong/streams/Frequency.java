package com.basicsstrong.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequency {
    static void frequencyOfString(List<String> list)
    {
        HashMap<String,Integer> map = new HashMap<>();

        for(String x: list)
        {
            map.put(x,map.getOrDefault(x,0) + 1);
        }
        for(Map.Entry y: map.entrySet()){
            System.out.println( y.getKey() + "  Frequency: " + y.getValue());
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        list.add("abc");
        frequencyOfString(list);
    }
}
