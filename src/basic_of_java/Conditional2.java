package basic_of_java;

import java.util.Scanner;

public class Conditional2 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
        System.out.println("Enter the no for checking :");
    int n = s.nextInt();
        // If the no is divisible by 5 or 3 but not by 15 .

        if(n%5 == 0 || n%3 == 0){

            if (n%15 !=0)
            {
                System.out.println("no is divisible by 5 or 3 but not by 15 ");
            }
            else
            {

                System.out.println("Not divisible");
            }
        }
        else
        {

            System.out.println("Not divisible by 5 and 3.");
        }
        // This by normal method (Better approach to solve this problem)
        if ((n % 5 == 0 || n % 3 == 0) && n % 15!= 0){
            System.out.println("no is divisible by 5 or 3 but not by 15 .");
        }
        else
        {
            System.out.println("Not divisible.");
        }

        System.out.println("Enter the first no:");
        int a = s.nextInt();
        System.out.println("Enter the second no:");
        int b = s.nextInt();
        System.out.println("Enter the third no:");
        int c = s.nextInt();

        if(a > b){
            if (a > c){

                System.out.println(a+" This is largest.");
            }
            else {

                System.out.println(c+" This is largest.");
            }
        }
        else {
                if(b > c){

                    System.out.println(b+" This is largest.");
                }
                else {

                    System.out.println(c+" This is largest.");
                }

        }
        // the ages of ram, shyam and ajay take as input and solve the youngest among them.


        System.out.println("Enter the first age:");
        int age_ram = s.nextInt();
        System.out.println("Enter the second age:");
        int age_shyam = s.nextInt();
        System.out.println("Enter the third age:");
        int age_ajay = s.nextInt();
        if (age_ram < age_shyam){

            if (age_ram < age_ajay) {

                System.out.println(age_ram+ " Ram is youngest");
            }
            else {

                System.out.println(age_ajay+ " Ajay is youngest.");
            }
        }
        else {
            if (age_shyam < age_ajay){

                System.out.println(age_shyam + " Shyam is youngest.");
            }
            else {

                System.out.println(age_ajay +" Ajay is youngest.");
            }
        }
        int k = 45;
      //  int d = k > 45;            // it given an error because the output will be boolean we have to store in  boolean data type.
        System.out.println(k == 45); // it is comparison operator and it gives true or false.
        System.out.println(k = 50);  // it assign value and then prints the output value
        System.out.println(k > 30);  // condition it gives true or false.


        // Very imp
        int i = 65;
        char ch = 'A';
        if (i == ch){

            System.out.println("Java is wow!");
        }
        else {

            System.out.println("java is headache");

        }
            // In java the int and char has very good relation but int and boolean are not friends .......>>>>>>


//        int j = 0;
//        boolean flag = false;
//        if (j == flag){
//
//            System.out.println();
//        }
    }
}
