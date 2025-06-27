package Loops;
import java.util.Scanner;
public class prino {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the number :");
                int n = s.nextInt();

                boolean isPrime = true;


                for(int i = 2 ; i <=Math.sqrt(n) ; i++){

                    if(n % i == 0){

                        isPrime = false;
                        break;
                    }


                }
                if(isPrime){

                    System.out.println( n +" It is Prime number");
                }
                else{

                    System.out.println( n + " It is not Prime number");
                }

            }
}