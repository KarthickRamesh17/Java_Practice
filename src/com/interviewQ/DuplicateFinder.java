package com.interviewQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {
    public static void main(String[] args) {
        String input = "Intellect";
        String[] strArray = input.split("");
        char[] charArr = input.toCharArray();
        List<String> numbers = Arrays.stream(strArray)
                .map(String::toString)
                .toList();
        HashSet<String> set = new HashSet<>();
        List<String> answer = numbers.stream().filter(x-> !set.add(x) ).collect(Collectors.toList());
        System.out.println(answer);
    }


}
