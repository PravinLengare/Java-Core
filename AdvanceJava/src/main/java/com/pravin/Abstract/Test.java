package com.pravin.Abstract;
abstract class A{
    public void add(){
        System.out.println("Adding ...");
    }
    public abstract void sub();
}
class B extends A{
    public void sub(){
        System.out.println("Suh ..");
    }
}
public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.sub();
    }
}
