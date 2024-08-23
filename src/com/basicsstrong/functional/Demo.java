package com.basicsstrong.functional;

@FunctionalInterface
interface A{
    void show(int a, int b);

}

public class Demo {

    public static void main(String[] args) {
            A obj = (a, b) -> {
                int c = a+b;
                System.out.println(c);
        };
       obj.show(10,20);
    }
}
