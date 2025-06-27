package Loops;
import java.util.Scanner;
public class breakandcontnue
{
    public static void main(String[] args) {

                int n = 10;
                for(int i = 1; i < n ; i++){

                    if(i%2==0){
                        System.out.println("Leave the iteration");
                        continue;
                    }
                    System.out.println(i);
                }
            }
}

