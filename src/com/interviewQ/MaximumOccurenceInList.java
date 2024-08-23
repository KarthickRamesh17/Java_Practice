package com.interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaximumOccurenceInList {

    static int maxOcc(ArrayList<Integer> list)
    {
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: list)
        {
            if(map.containsKey(i))
                map.put(i, map.getOrDefault(i,0) + 1);
            else
                map.put(i,1);
        }
        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            if(max < val.getValue())
            {
                max  = val.getValue();
            }
        }
        return max;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,2,2,1,3,3,1,1));
        int ans = maxOcc(list);
        System.out.println(ans);
    }
}
