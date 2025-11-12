package com.pravin.Inheritance;

class A extends Object{
    A(){
        System.out.println("Default cons of A");
    }

    A(int n){
        System.out.println("Parameterized cons of A");
    }
}
class B extends A{
    B(){

        System.out.println("Default cons of B");
    }

    B(int n){
        this();
        System.out.println("Parameterized cons of B");
    }
    public B getClass(B b){
        return b;
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B b = new B(5);
        System.out.println(b.getClass(b));
        System.out.println(b.hashCode());

    }
}
