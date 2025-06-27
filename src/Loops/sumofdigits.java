package Loops;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the no for its digit of sum:");
                int n = s.nextInt();
                int sum = 0;

                if(n < 0){      // To handle the negative number

                    n = -n;
                }


                while(n!=0){

                    // 1234
                    int digit = n % 10;
                    sum += digit;
                    n = n / 10;
                }
                System.out.println("The sum of digits is "+sum);
            }
        }

