package Loops;
import java.util.*;
public class factorial {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number to calculate factorial");
                int n = s.nextInt();

                int factorial=1;
                for(int i = 1; i <= n ; i++)
                {

                    factorial = factorial * i;
                }

                System.out.printf("The factorial of %d number is %d ",n,factorial);
            }
        }


