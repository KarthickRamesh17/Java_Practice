package com.basicsstrong.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P1 {
    public static void main(String[] args) {
      /*  List<Integer> list = Arrays.asList(1,3,2,4,3,1,2);

        List<Integer> distinctList = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(distinctList);*/

        List<Integer> list1 = Arrays.asList(1,2,3,5,4);
        List<Integer> list2 = Arrays.asList(5,6,8,9);
        List<Integer> finalList = Stream.concat(list1.stream(),list2.stream()).distinct().collect(Collectors.toList());

        //List<Integer> ans = finalList.stream().distinct().collect(Collectors.toList());
        System.out.println(finalList);

    }
}
