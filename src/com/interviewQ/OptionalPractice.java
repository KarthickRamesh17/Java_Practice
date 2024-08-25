package com.interviewQ;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        //check the string is empty
        Optional<String> check = Optional.empty();
        //check = Optional.of("hai");
        System.out.println(check);

        String[] str = new String[10] ;
        str[5]  ="Karthick";



        Optional<String> ch = Optional.ofNullable(str[5]);
        System.out.println(ch.get().toLowerCase());
//        if(ch.isPresent())
//        {
//            String ans = ch.get().toLowerCase();
//            System.out.println(ans);
//        }
//        else{
//            System.out.println("No values present");
//        }




    }
}
