package dsa_in_java.Arrays;

import java.util.Scanner;

public class EqualSumPartion {
    static int findSum(int []arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length ;i++){

            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSum(int []arr){
        int totalSum = findSum(arr);
        int n = arr.length;
        int prefSum = 0;
        for (int i = 0; i < n ;i++){

             prefSum+= arr[i];
             int suffixSum = totalSum - prefSum;
             if (prefSum == suffixSum){

                 return true;
             }

        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements:");

        for(int i = 0 ; i < n ; i++){

            arr[i] = s.nextInt();
        }
        System.out.println("Equal partition of the array of same sum is :");
        boolean k = equalSum(arr);
        System.out.println(k);

    }
}