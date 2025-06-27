package dsa_in_java.Arrays;
import java.util.Scanner;

public class Array_07 {
    static int [] suffixSum(int []arr){
        int n = arr.length;
        int []suSum = new int[n];
        suSum[n-1] = arr[n-1];
        for (int i = n - 2; i >= 0 ; i--){ 

            suSum[i] = suSum[i + 1] + arr[i];
        }
        return suSum;
    }
    static void suffixSum1(int []arr){
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--){

            arr[i] = arr[i+1] + arr[i];
        }
    }
    static int[]  prefixSum(int []arr){
        int n = arr.length;
        int []preSum = new int[n];
        preSum[0] = arr[0];
        for (int i = 1 ; i <= n -1 ; i++){

            preSum[i] = preSum[i-1] + arr[i];
        }
        return preSum;
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

        for(int i = 0 ; i <= n - 1 ; i++){

            arr[i] = s.nextInt();
        }
        /*
        int []preSum = prefixSum(arr);
        Array_07.printArray(preSum);
        //Queries.prefixSum(arr);

        System.out.println("Enter the no of queries:");
        int q = s.nextInt();

        while (q-- > 0){

            System.out.println("Enter the range:");
            int l = s.nextInt();
            int r = s.nextInt();

            int ans =  preSum[r] - preSum[l -1] ;
            System.out.println("Sum is :"+ ans);
        }

         */
        System.out.println("The suffix sum of the array is :");
        int []suSum = suffixSum(arr);
        Array_07.printArray(suSum);
        System.out.println("The suffix sum of the array is without creating a array:");
        suffixSum1(arr);
        printArray(arr);

    }
}
