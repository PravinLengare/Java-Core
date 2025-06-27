package ExceptionHandling;

import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int []arr = new int [5];
        arr[0] =50;
        arr[1] = 23;
        arr[2] = 33;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array index");
        int idx = s.nextInt();
        System.out.println("Enter the number you want to divide");
        int k = s.nextInt();
        try{
            System.out.println("Entered array index value is :"+arr[idx]);
            System.out.println("Enter the number you want to divide:"+k);
            System.out.println(arr[idx] / k);

        }
        catch (ArithmeticException e ){
            System.out.println("There is an ArithmeticException");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is an ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("There is an exception");
            System.out.println(e);
        }


    }
}
