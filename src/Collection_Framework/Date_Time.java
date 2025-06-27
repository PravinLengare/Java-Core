package Collection_Framework;

public class Date_Time {
    public static void main(String[] args) {
        System.out.println("The no of hours spent is :"+System.currentTimeMillis()/1000/3600/24);
        System.out.println("The no of days spent is :"+  System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("The milliseconds spent from 1970 is :"+System.currentTimeMillis());
    }
}
