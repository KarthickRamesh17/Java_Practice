package com.interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

    static int secondLargestNo(List<Integer> input)
    {
        int largest = input.get(0);
        int seclargest = -1;
        for(int i =0;i<input.size();i++)
        {
            if(input.get(i) > largest )
            {
                seclargest = largest;
                largest = input.get(i);
            } else if (input.get(i) < largest && input.get(i) > seclargest ) {
                seclargest = input.get(i);
            }


        }
        return seclargest;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,7,7,5));
        int answer = secondLargestNo(list);
        System.out.println(answer);
    }
}
