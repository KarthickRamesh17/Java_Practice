package com.interviewQ;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondHighest
{

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());

        System.out.println(list);
        //System.out.println(list.get(list.size() - 2));



    }

}
