package com.interviewQ;


import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class NonRepeating {

    static int nonRepeatingCharacter(String str){
        char[] charArr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        //count frequency of each character
        for(char c: charArr)
        {
            map.put(c, map.getOrDefault(c,0)  + 1 );
           // System.out.print(c);
        }
        for(int i =0 ;i<charArr.length;i++)
        {
           // System.out.print(map.get(str.charAt(i)) + " ");
            if( map.get(str.charAt(i)) == 1)
            {
                System.out.println(charArr[i]);
                return i;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "abdcefacb";
//        StringJoiner str1 = new StringJoiner(" ," ,"[","]");
//        for(char num: str.toCharArray())
//        {
//            str1.add(Character.toString(num));
//        }
//        System.out.println(str1);
        int ans = nonRepeatingCharacter(str);
        System.out.println("Non Repeating character Index: "+ ans);


    }
}
