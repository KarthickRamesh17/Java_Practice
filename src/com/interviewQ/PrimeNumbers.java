package com.interviewQ;

public class PrimeNumbers {
    static boolean isprime(int x)
    {
        if(x == 1 || x == 0)
        {
            return false;
        }
        for(int i=2; i<x ; i++)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i=1;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.println(i + " ");
            }
        }

    }
}
