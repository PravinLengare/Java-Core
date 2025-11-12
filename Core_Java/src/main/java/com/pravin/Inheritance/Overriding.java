package com.pravin.Inheritance;

class Cal1 {
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
}
class AdvCalc1 extends Cal1 {
    @Override
    public int add(int n1, int n2)
    {
        System.out.println("Override called !");
        return n1+n2;
    }

}

public class Overriding {
    public static void main(String[] args) {
        AdvCalc1 advCalc = new AdvCalc1();
        System.out.println(advCalc.add(2,3));
    }
}
