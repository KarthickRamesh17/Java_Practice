package com.interviewQ;

import java.util.HashMap;
import java.util.Map;

public class IterationHashmap
{
    public static void iterateHashMap(HashMap<Integer,String> map){
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " ->" + entry.getValue());
        }

    }
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "hai");
        map.put(2, " data");
        iterateHashMap(map);
    }
}
