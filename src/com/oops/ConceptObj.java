package com.oops;

class Parent {
    public void method(Object o) {
        System.out.println("Parent Object Method");
    }

    public void method(String s) {
        System.out.println("Parent String Method");
    }
}

class Child extends Parent {
    @Override
    public void method(Object o) {
        System.out.println("Child Object Method");
    }

    @Override
    public void method(String s) {
        System.out.println("Child String Method");
    }
}

public class ConceptObj {


    public  void method(Object o) {
        System.out.println("Object Method");
    }

    public void method(String s) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        ConceptObj obj = new ConceptObj();
        Parent pobj = new Parent();
        pobj.method(null);
       // obj.method(null);
        obj.method((Object) null);
        obj.method("hai");

    }

}
