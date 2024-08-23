package com.basicsstrong.streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayingWithStreams {


    public static void main(String[] args) {
        String inputs = "ilovejavatechie";
       // String[] strArr = inputs.split("");
        //System.out.println(Arrays.toString(strArr));

        //Count the occurence of each character
        LinkedHashMap<String, Long> map =Arrays.stream(inputs.split(""))
                .collect(Collectors.groupingBy( Function.identity() , LinkedHashMap::new ,Collectors.counting() ) );
        System.out.println(map);
        map.forEach( (k,v) -> System.out.println("key: " + k + " Value: " + v));

        //
//        List<String> duplicate =Arrays.stream(inputs.split(""))
//                .collect(Collectors.groupingBy( Function.identity() ,Collectors.counting() ) )
//                .entrySet().stream()
//                .filter(x -> x.getValue() == 1)
//                .map(Map.Entry::getKey)
//
//
//
//                .collect(Collectors.toList());
//        System.out.println(duplicate.toString());

//        int arr[] = {2,4,6,8,2,10,4,12,6};
//
//        //sum all the elelemnts in arr
//        int sum = Arrays.stream(arr).sum();
//        System.out.println("hai" + sum);
//
//       // int[] ansList = Arrays.stream(arr).filter(x->x%3==0).map(x -> x*x).toArray();
//        List<Integer> arrList = Arrays.stream(arr)
//                .boxed()
//                .map(x -> {
//                    if (x % 3 == 0) {
//                        return x * x;
//                    } else {
//                        return x;
//                    }
//                })
//                .collect(Collectors.toList());
//
//
//        System.out.println(" ");
//        for(int i: arrList)
//        {
//            System.out.print(i+ " ");
//        }
    }
}
