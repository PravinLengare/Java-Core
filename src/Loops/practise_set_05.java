package Loops;
import java.util.Scanner;
public class practise_set_05 {
    public static void main(String[] args) {

                // 01 Write a brogram to sum irst n even numbers
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the num to sum");
                 int n = s.nextInt();
                 int i=1;
                 int sum = 0;
                 while(i <= n)
                 {
                     if(i % 2== 0)
                     {
                         sum+=i;

                     }
                     i++;

                 }
                 System.out.println("The sum of all even no is " +sum);

                // 08

//                int sum = 0;
//                for(int i = 10; i >= 1 ; i-- ){
//                    int x = (n * i);
//                    System.out.println(n +"*"+ i +"="+x);
//                    sum = sum + x;
//
//                }
//                System.out.println(sum);
            }
        }

