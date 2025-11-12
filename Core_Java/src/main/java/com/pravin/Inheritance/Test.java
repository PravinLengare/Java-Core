package com.pravin.Inheritance;

class Cal {
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1, int n2)
    {
        return n1-n2;
    }
}
class AdvCalc extends Cal {

    public int multi(int n1, int n2)
    {
        return n1*n2;
    }
    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

class VeryAdvCal extends AdvCalc{
    public double power(int x , int y){
        return Math.pow(x,y);
    }
}

public class Test
{
    public static void main(String a[])
    {
//		Calc obj=new Calc();
        //AdvCalc obj=new AdvCalc();
        VeryAdvCal obj = new VeryAdvCal();
        int r1=obj.add(4, 5);
        int r2=obj.sub(7,3);
        int r3=obj.multi(5,3);
        int r4=obj.div(15,4);


        System.out.println(r1+" "+r2 +" "+r3+" "+r4+" "+obj.power(2,3));

    }
}