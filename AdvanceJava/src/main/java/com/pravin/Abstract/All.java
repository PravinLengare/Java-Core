package com.pravin.Abstract;

abstract class Pravin{
    public void name(){
        System.out.println("Pravin ...");
    }
}
public class All {
    public static void main(String[] args) {
        Pravin obj = new Pravin() {
            public void name(){
                System.out.println("Pravin Lengare ...");
            }
        };

        obj.name();
    }
}
