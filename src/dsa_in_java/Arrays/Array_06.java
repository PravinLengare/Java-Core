package dsa_in_java.Arrays;

import java.util.Scanner;

public class Array_06 {
    // creating new array ...
    static int[]  prefixSum(int []arr){
        int n = arr.length;
        int []preSum = new int[n];
        preSum[0] = arr[0];
        for (int i = 1 ; i <= n -1 ; i++){

            preSum[i] = preSum[i-1] + arr[i];
        }
        return preSum;
    }
    static void prefSumWithoutCreatingArray(int []arr){
        int n = arr.length;
        for (int i = 1 ; i <= n -1 ; i++){

            arr[i] = arr[i-1] + arr[i];
        }

    }
    static void printArray(int []arr){

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements:");

        for(int i = 0 ; i < arr.length ; i++){

            arr[i] = s.nextInt();
        }
        int [] preSum= prefixSum(arr);
        System.out.println("With creating a new array:");
        Array_06.printArray(preSum);
        Array_06.prefSumWithoutCreatingArray(arr);
        System.out.println("Without creating a new array:");
        Array_06.printArray(preSum);

    }
}
