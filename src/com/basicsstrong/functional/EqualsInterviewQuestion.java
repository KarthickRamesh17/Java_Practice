package com.basicsstrong.functional;

public class EqualsInterviewQuestion {
    public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false - compares the reference or memory location of objects in a heap
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true - Compares based on the content
    }
}
