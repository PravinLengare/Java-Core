package Loops;

import java.util.Scanner;

public class sudigitts {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number to get sum of it ");
                int n = s.nextInt();
                int sum = 0;
                for(int i = 1; i <= n ; i++ ){

                    sum+= i;
                }
                System.out.println("The sum of these numbers is "+sum);
            }
        }


