package com.interviewQ;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

    static boolean anagram(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);

    }
    public static void main(String[] args) {
        String str1 = "dog";
        String str2 = "god";

        System.out.println(anagram(str1,str2));

    }
}
