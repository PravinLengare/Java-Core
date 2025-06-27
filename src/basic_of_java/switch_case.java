package basic_of_java;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {

                System.out.println("Enter the values and operator:");
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the first value :");
                int a = s.nextInt();
                System.out.println("Enter the second value :");
                int b = s.nextInt();

                System.out.println("Enter the operator:");
                char ch = s.next().charAt(0);

                switch (ch) {
                    case '+' :
                        System.out.println("The addition is "+ (a+b));
                        break;

                    case '-' :

                        System.out.println("The substraction is "+ (a-b));
                        break;


                    case '*' :

                        System.out.println("The multiplication is "+ (a*b));
                        break;

                    case '/' :

                        System.out.println("The division is "+ (a/b));
                        break;

                    default:

                        System.out.println("Not valid operator");
                }
            }

        }


