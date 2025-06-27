package Loops;
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {



                //     //System.out.println(3);
                //     System.out.println("Entering in loop :");
                //     int i = 1;                                      // first checks the condition
                //     while(i<=10){

                //         System.out.println(i);
                //         i++;
                //     }
                //     System.out.println("Executed while loop");

                //     int c = 1;                                  // first executes and then it checks the condition
                //     do {
                //         System.out.println(c);
                //         c++;
                //     } while (c<=50);
                // }
                Scanner s = new Scanner(System.in);
                int n = s.nextInt();
                for(int i=n; i>0 ; i--){

                    System.out.println(i);
                }
    }
}
