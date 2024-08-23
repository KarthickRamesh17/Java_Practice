package com.basicsstrong.functional;

import java.util.Optional;

//Covert the string value to the uppercase
public class OptionalEg {
    public static void main(String[] args) {
        Optional<String> name = getName();
        if(name.isPresent())
        {
            String ans = name.get();
            ans = ans.toUpperCase();
            System.out.println(ans);
        }
        else {
            System.out.println("Value is not present");
        }
        if(name.isEmpty()){
            System.out.println("Yes its empty");
        }
        else
        {
            System.out.println(name.get().toUpperCase());
        }
    }
    public static Optional<String> getName(){
        String name = "Karthick";
        Optional<String> value = null;
        if(name == null)
        {
            value = Optional.empty();
        }
        else {
            value = Optional.of(name);
        }
        return value;
    }
}
