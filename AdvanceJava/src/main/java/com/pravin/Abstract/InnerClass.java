package com.pravin.Abstract;
class Outer {

    public void add (){
        System.out.println("Adding in outer");
    }

    static class inner{

        public static void add (){
            System.out.println("Adding in inner");
        }
    }
}
public class InnerClass{
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.add();

        Outer.inner obj1 = new Outer.inner();
        obj1.add();
    }
}
