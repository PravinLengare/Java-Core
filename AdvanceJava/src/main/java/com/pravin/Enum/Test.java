package com.pravin.Enum;

enum Status{
    RUNNING,FAILED,PENDING,SUCCESS;
}
public class Test {
    public static void main(String[] args) {
        //Status status = Status.RUNNING;
        Status []status = Status.values();
        for (Status s :status){
            System.out.println(s.ordinal());
        }
    }
}
