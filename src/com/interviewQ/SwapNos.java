package com.interviewQ;

public class SwapNos {
    static void swapNumbers(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 10, b= 20;

        swapNumbers(a,b);
        swapNumbers(20,40);
        swapNumbers(50,70);
    }
}
