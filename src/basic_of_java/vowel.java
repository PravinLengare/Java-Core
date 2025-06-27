package basic_of_java;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {

                // Write a program to check if a given character is a vowel, consonant, or neither (e.g., a digit or special character).
                System.out.println("Enter the characater :");

                Scanner d = new Scanner(System.in);
                char ch = d.next().charAt(0);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||

                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'   )
                {

                    System.out.printf("This char %c is vowel ",ch);
                }
                else if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z') )
                {

                    System.out.println(ch+ "It is a consonant");
                }

                else {

                    System.out.println(ch+ "It is not valid alphabet");
                }

            }
        }
