package ExceptionHandling;

import java.util.Scanner;

public class Nested_Loops {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 4;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array index:");
        int i = s.nextInt();
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Enter to my coding journey!");
                try {
                    System.out.println(arr[i]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException occur!");
                }
            } catch (Exception e) {

                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program ");
    }
}
