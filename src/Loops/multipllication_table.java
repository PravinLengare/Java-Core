package Loops;
import java.util.Scanner;

public class multipllication_table {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number to get multiplication table of it ");
                int n = s.nextInt();
                int sum = 0;
                for(int i = 10; i >= 1 ; i-- ){
                    int x = (n * i);
                    System.out.println(n +"*"+ i +"="+x);
                    sum = sum + x;

                }
                System.out.println(sum);

                // In reverse order

                // int range = s.nextInt();
                // for (int num = 1 ; num <= range ; num++) {


                //     for(int i = 1; i <= 10 ; i++){

                //         System.out.println(num +"*"+ i +"="+(num * i));

                //     }
                //     System.out.println();

                // }// for specific range
                //
    }
}
