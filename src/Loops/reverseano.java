package Loops;

import java.util.Scanner;

public class reverseano {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for to reverse it :");
        int n = s.nextInt();
        int reverse = 0;

        while(n!=0){

            int digit = n % 10;
            reverse = reverse *10 + digit;
            n = n / 10;

        }
        System.out.printf("The reverse of number is %d",reverse);
    }
    }





