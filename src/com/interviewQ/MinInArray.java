package com.interviewQ;

import java.util.HashSet;

public class MinInArray {

    static Integer minimumInFirstArray(int[] arr1,int[] arr2)
    {
        HashSet<Integer> set2 = new HashSet<>();
        for(int val2: arr2)
        {
            set2.add(val2);
        }
        Integer minimumValue = null;

        for(int val1: arr1){
            if(!set2.contains(val1))
            {
                if(minimumValue == null || val1 < minimumValue){
                    minimumValue = val1;
                }
            }
        }
        return minimumValue;
    }
    public static void main(String[] args){
        int[] arr1 = { 1,2,1,3,4,5,2,1,9,8};
        int[] arr2 = {5,4,1,6,7,3,5,8};

        Integer result = minimumInFirstArray(arr1,arr2);
        if(result != null){
            System.out.println("The Minimum in Array is : "  + result);
        }
        else {
            System.out.println("No such value found");
        }


    }
}
