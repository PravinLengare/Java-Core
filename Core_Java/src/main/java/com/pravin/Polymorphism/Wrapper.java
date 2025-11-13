package com.pravin.Polymorphism;

public class Wrapper {
    public static void main(String[] args) {
        int a = 5;
        // Integer i = new Integer(5);    // Deprecated
        Integer i = a;                  // Auto-Boxing
        System.out.println(i);

        int k = i;                     // UnBoxing
        System.out.println(k);


    }
}
