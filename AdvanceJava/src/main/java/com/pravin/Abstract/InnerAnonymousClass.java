package com.pravin.Abstract;
class outer1 {

    public void add (){
        System.out.println("Adding in outer");
    }
}
public class InnerAnonymousClass{
    public static void main(String[] args) {
        outer1 obj = new outer1(){
            public void add(){
                System.out.println("Adding in anonymous class....");
            }
        };
        obj.add();
    }
}
