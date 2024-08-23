package com.interviewQ;

import java.util.StringJoiner;

public class StringJoinerEg {
    public static void main(String[] args) {
        StringJoiner str = new StringJoiner(",","[","]");
        str.add("a").add("b").add("c");
        System.out.println(str);

        StringJoiner str1 = new StringJoiner(":");
        str1.add("p").add("q");
        System.out.println(str1);

        System.out.println(str.merge(str1));

    }


}
