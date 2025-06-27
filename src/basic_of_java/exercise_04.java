package basic_of_java;
import java.util.Scanner;
public class exercise_04 {
    public static void main(String[] args) {

                // que 1 what will be the output

                // int a = 10;
                // if(a=11){
                //     System.out.println("I am 11");
                // }
                // else {

                //     System.out.println("I am not 11");
                // }

                // que 2 take input from the user

                Scanner s = new Scanner(System.in);
                // System.out.println("Enter the marks of english:");
                // int marks1 = s.nextInt();
                // System.out.println("Enter the marks of maths:");
                // int marks2 = s.nextInt();
                // System.out.println("Enter the marks of marathi:");
                // int marks3 = s.nextInt();

                // float avg = (marks1+marks2+marks3 )/ 3.0f;
                // System.out.println("Your overall percentage is "+avg);

                // if(avg >=40 && marks1 >= 33 && marks2 >=33 && marks3 >= 33 ){
                //     System.out.println("The student is passed!");
                // }
                // else {

                //     System.out.println("The student is failed!");
                // }


                // que 3
                // System.out.println("Enter your income in lacks ");
                // float tax = 0;
                // float income = s.nextFloat();

                // if (income < 2.5){
                //     tax = tax + 0;
                // }

                // else if (income > 2.5f && income <= 5.0f) {

                //     tax = tax + 0.05f * (income - 2.5f);
                // }

                // else if (income > 5.0f && income <= 10.0f) {

                //     tax = tax + 0.05f * (income - 2.5f);
                //     tax = tax + 0.2f * (income - 5.0f);
                // }

                // else if (income > 10.0f  ) {

                //     tax = tax + 0.05f * (5.0f- 2.5f);
                //     tax = tax + 0.2f * (10.0f - 5.0f);
                //     tax = tax + 0.3f * (income - 10.0f);
                // }

                // System.out.println("The total tax paid by the employee is "+tax);
                // }

                // que 4 switch case for week

                //System.out.println("Enter the day on the number :");
                // int day = s.nextInt();

                // switch(day) {

                //     case 1 :

                //         System.out.println("The day is Monday");
                //         break;

                //     case 2 :

                //         System.out.println("The day is Tuesday");
                //         break;

                //     case 3 :

                //         System.out.println("The day is Wednesday");
                //         break;

                //     case 4 :

                //         System.out.println("The day is Thursday");
                //         break;

                //     case 5 :

                //         System.out.println("The day is Friday");
                //         break;


                //     case 6 :

                //         System.out.println("The day is Saturday");
                //         break;

                //     case 7:

                //         System.out.println("The day is Sunday");
                //         break;

                //     default:

                //         System.out.println("Entered option is invalid");
                // }
                System.out.println("Enter the extension of website");
                String website = s.next();

                if(website.endsWith(".org")){

                    System.out.println("It is organizational website");
                }

                else if(website.endsWith(".com")){

                    System.out.println("It is comercial website ");

                }

                else if(website.endsWith(".in")){

                    System.out.println("It is Indian website ");

                }

                else {

                    System.out.println("It is invalid");
                }



            }
        }


