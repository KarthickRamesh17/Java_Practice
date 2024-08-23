package com.interviewQ;

public class Palindrome {

    public static boolean palindrome(String input){
       // char[] inputArr = input.toCharArray();
        int left = 0 , right = input.length() - 1;
        while(left<right){
            if(input.charAt(left)!= input.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
            return true;
        }

    public static void main(String[] args) {
        String input = "raceca";
        boolean ans = palindrome(input);
        System.out.println(ans);
    }
}
