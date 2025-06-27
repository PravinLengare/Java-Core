package Loops;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {


                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number to calculate fibonacci sequence");
                int n = s.nextInt();

                if(n <= 0){

                    System.out.println("Enter the positive number");
                }

                else {

                    System.out.println("Fibonacci sequence up to " + n + " terms:");
                    int first = 0,second = 1;

                    for(int i = 1; i <= n ; i++)
                    {
                        System.out.print(first + " ");
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                }
    }
}