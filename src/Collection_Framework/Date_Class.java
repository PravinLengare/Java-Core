package Collection_Framework;

import java.util.Date;

public class Date_Class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());  yes we can store the date and time in long data type

        Date d = new Date();
        System.out.println(d);
        Date  d1 = new Date(125,0,12,1,0);
        System.out.println(d1);
        System.out.println(d.getTime());
        System.out.println(d.getDate());  // if when we call it again
        System.out.println(d.getClass());
        System.out.println(d.getDay());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        System.out.println(d.getTimezoneOffset());
    }
}
