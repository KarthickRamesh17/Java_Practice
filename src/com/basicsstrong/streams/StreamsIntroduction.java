package com.basicsstrong.streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsIntroduction {
    static int maximumInAList(List<Integer> list)
    {
        return list.stream().max(Integer::compare).get();
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(50);
        int maximum = maximumInAList(list);
        System.out.println(maximum);

        System.out.println(list);


        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer i: list){
            if( i >= 30){
                newList.add(i);
            }
        }
        System.out.println(newList);


        //Streams
        //filter
        List<Integer> l1 = list.stream().filter(i -> i >= 30).collect(Collectors.toList());
        System.out.println(l1);

        //map
        List<Integer> l2 = list.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(l2);

        //count
        long cnt = list.stream().filter(i-> i>=30).count();
        System.out.println(cnt);

        //Default Natural Sorting
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //Custom Sorting
        List<Integer> l4 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(l4);

        //get distinct elements
        List<Integer> distinctNumbers = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        List<Integer> sumNo = Arrays.asList(1,2,3,4,5,6,7,6);
        //print the even numbers in the list
        List<Integer> evenNo = sumNo.stream().filter(n->n%2==0).collect(Collectors.toList());
        //summing only the even numbers in the list
        int sumOfEven = sumNo.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
        //Maxing value in the list -- use Optional since  .max return object
        Optional<Integer> maxValue = sumNo.stream().max(Integer::compare);
        //sum of all the no's in the list
        int sum = sumNo.stream().mapToInt(Integer::intValue).sum();
        int s = maxValue.get();
        System.out.println(evenNo);
        System.out.println(sumOfEven);
        System.out.println(maxValue);
        System.out.println(s);
        System.out.println(sum);

        //count the number of elements greater than or equal to 5
        long countX = sumNo.stream().filter(n-> n>=5).count();
        System.out.println("count "+ countX);


        //distinct element in the list
        List<Integer>  distinctList = sumNo.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
        HashSet<Integer> set = new HashSet<>();
        for(int n: sumNo)
        {
            set.add(n);
        }
        System.out.println("Set "+set);

        Set<Integer> setEx = new HashSet<>(sumNo);
        System.out.println("hai" + setEx);

        //Ascending order in the list
        List<Integer> ascList = sumNo.stream().sorted().collect(Collectors.toList());
        System.out.println(ascList);
        //Descennding order in the list
        List<Integer> desList = sumNo.stream().sorted((i1,i2)->  i2.compareTo(i1)).toList();
        System.out.println(desList);

//Optional for max(Integer::compare)
//count() returns in long so create a variable in long




    }
}
