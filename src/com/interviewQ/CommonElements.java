package com.interviewQ;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {

    static int[] common(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int n = Math.max(arr1.length, arr2.length);
        int[] temp = new int[n];
        //int[] ans = new int[n];
        for(int i =0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for (int i = 0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                temp[count++] = arr2[i];
            }
        }
        int[] ans = new int[count];
        System.arraycopy(temp, 0, ans, 0, count);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,5,6,7,8};
        int[] ansArr = common(arr1,arr2);
        System.out.println(Arrays.toString(ansArr));

    }


}
