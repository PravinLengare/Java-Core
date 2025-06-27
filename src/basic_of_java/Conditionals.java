package basic_of_java;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();

        if(n%2==0){

            System.out.println("It is a even no:" +n);
        }

        else{
            System.out.println("It is a odd no:" +n);
        }

        // For leap year or not

        if((n%100!= 0 || n%400 == 0 ) && n%4 ==0 ){

            System.out.println("It is leap year :"+n);
        }
        else {

            System.out.println("It is not leap year :"+n);

        }

        // For absolute value
        if(n < 0){
            n = n * (-1);
            System.out.println("The absolute value is :"+(n));
        }
        else {

            System.out.println("The absolute value is :"+n);
        }

        // Profit or loss for the seller
        System.out.println("Enter the selling price:");
        float selling_price = s.nextFloat();
        System.out.println("Enter the cost price:");
        float cost_price = s.nextFloat();

        if (selling_price > cost_price){

            float profit = selling_price - cost_price;
            System.out.println("He has made profit and it is :"+profit);
        }
        else if(cost_price > selling_price){

            float loss = cost_price - selling_price;
            System.out.println("He has made a loss of :"+loss);
        }
        else {

            System.out.println("He has made nothing means no profit no loss in his business");
        }

        // Input the percentage of students and print their grade according to it.

        System.out.println("Enter the marks of student:");
        float per = s.nextFloat();
        if(per >90 && per <=100){

            System.out.println("Your grade is Excellent!");
        }
        else if (per > 80 && per <= 90) {

            System.out.println("Your grade is Very Good!");
        }
        else if (per > 70 && per <= 80) {

            System.out.println("Your grade is Good!");
        }
        else if (per > 60 && per <= 70) {

            System.out.println("Your grade is Can do Better!");
        }
        else if (per > 50 && per <= 60) {

            System.out.println("Your grade is Average!");
        }
        else if (per > 40 && per <= 50) {

            System.out.println("Your grade is Below Average!");
        }
        else if ( per <= 40) {

            System.out.println("Your grade is Fail!");
        }
        else {

            System.out.println("I am Pravin.");
        }
        // Take input a no and tell if it a two digit number.
        if (n > 9 && n <= 99){

            System.out.println("It is a two digit number..");
        }

        else {
            System.out.println("It is not a two digit number..");
        }
        if (n%5==0 && n%3==0){

            System.out.println("It is divisible 5 and 3..");
        }
        else {

            System.out.println("It is not divisible by 5 and 3.");
        }

        if (n%5==0 && n%3!=0){

            System.out.println("It is divisible 5 and not by 3..");
        }
        else {

            System.out.println("It is  divisible by 5 and 3.");
        }

        System.out.println("Enter the first no:");
        int a = s.nextInt();
        System.out.println("Enter the second no:");
        int b = s.nextInt();
        System.out.println("Enter the third no:");
        int c = s.nextInt();

        if (a > b &&  a > c){

            System.out.println(a+" The a is the greatest among them.");
        }
        else if(b > a && b > c){

            System.out.println(b+" The b is the greatest among them.");
        }
        else {

            System.out.println(c+" The c is the greatest among them.");
        }

        // If the no is divisible by 5 or 3 but not by 15 .

        if(n%5 == 0 || n%3 == 0){

            if (n%15 !=0){
                System.out.println("no is divisible by 5 or 3 but not by 15 ");
            }
            else {

                System.out.println("Not divisible");
            }
        }
        else {

            System.out.println("Not divisible by 5 and 3.");
        }

    }
}
