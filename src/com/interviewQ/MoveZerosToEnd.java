package com.interviewQ;

public class MoveZerosToEnd {
    static void moveZeros(int[] arr)
    {
        int n = arr.length, count = 0;

        for(int i = 0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while (count < n)
        {
            arr[count++] = 0;
        }
        for(int x: arr)
        {
            System.out.print(x+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,0,0,8,6,9};
        moveZeros(arr);
    }
}
