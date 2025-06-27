package ExceptionHandling;
import java.util.Scanner;

import java.util.Scanner;

public class Errors_Demo {
    public static void main(String[] args) {
        /*
         Error Handling Examples
         1. Syntax Error -> If there is not following the rules of java then this will happen.And this is problem of programmer only
        */

        int a = 3;
        int b = 3;

        System.out.println(a+b);

        /* 2. Logical Error -> If there is a logically incorrect.And this is problem of programmer only.Here the ide can't be predicted the error. */

        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        /*
         3.Runtime Error -> If there is error occurs at runtime this is problem of user only.
         It can be a exception because the prg is compiled but the user has give it wrong input to handle the pgr.
        */
        int k;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        k = s.nextInt();
        System.out.println("The number is provided by user is 1000 "+ 1000/k);



    }
}
