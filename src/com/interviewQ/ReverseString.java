package com.interviewQ;

public class ReverseString {
    static String reveseString(String input){
        char[] charArr = input.toCharArray();
        int left = 0 , right = input.length() - 1;
        while(left<right)
        {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }
    public static void main(String[] args)
    {
        String s = "Karthick";
        System.out.println(reveseString(s));

    }
}
