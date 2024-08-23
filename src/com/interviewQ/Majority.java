package com.interviewQ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majority {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[]{3, 2, 3};
        HashMap<Integer,Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            map.put(arr[i],count++);
        }

        for(Map.Entry<Integer,Integer> x: map.entrySet())
        {

        }

    }
}
