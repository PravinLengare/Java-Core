package com.pravin.Polymorphism;

class A{

    public void show(){
        System.out.println("in A show");
    }
}
class B extends A{

    public void show1(){
        System.out.println("in A show");
    }
}
public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        A obj = (A) new B();
        obj.show();

        B obj2 = (B) obj;
        obj2.show1();

    }
}
