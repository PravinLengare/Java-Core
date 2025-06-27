package dsa_in_java.Arrays;

import java.util.Scanner;

public class Arrays_04 {

    static void swapNumber(int a, int b){

        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);
    }
    static void swapNumberWithout(int a,int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The value of a is :"+a);
        System.out.println("The value of b is :"+b);

    }
    static int[] reverseArray(int []arr){
        int j = 0;
        int n = arr.length;
        int ans[] = new int[n];
        for(int i = n - 1; i >= 0; i--) {

            ans[j++] = arr[i];
        }

        return ans;

    }
    static void reverseArray1(int []arr,int i,int j){
        int n = arr.length;
//        int i = 0;
//        int j = n - 1;

        while (i < j){
            swap(i,j ,arr);
            i++;
            j--;
        }

    }
    static int [] rotateArray(int arr[],int k){

        int n = arr.length;
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for(int i = n - k; i < n; i++){

            ans[j++] = arr[i];
        }
        for(int i = 0; i < n - k; i++){  // or i <= n - k -1

            ans[j++] = arr[i];
        }
        return ans;
    }
    static void rotateArrayInPlace(int arr[] ,int k){
        int n = arr.length;
        k = k % n;
        reverseArray1(arr,0,n-k-1);
        reverseArray1(arr,n-k,n-1);
        reverseArray1(arr,0,n-1);
    }
    static void printArray(int []arr){

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void swap(int i,int j, int []arr){
        int t;
        t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static void main(String[] args) {
        /*
        int a = 3;
        int b = 9;
        // By using the temp variable
        System.out.println("With temp variable:");
        Arrays_04.swapNumber(a,b);
        // Not using the temp variable
        System.out.println("Without temp variable:");
        Arrays_04.swapNumberWithout(a,b);

        // Q.2 Reverse a given array .
        // This requires a array.
        int arr[] = {1,2,3,4,5,6,7};
        int ans[] = reverseArray(arr);
        Arrays_04.printArray(ans);

        // we are doing by change it array given itself.

        reverseArray1(arr);
        printArray(arr);



         */


        // Q.3 Rotate a given array k times .
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("Original array is :");
        printArray(arr);
        int k = 5;
        System.out.println("The rotated array is :");
        int ans[] = rotateArray(arr,k);
        printArray(ans);

        // Q.3 Rotate a given array k times in place .

        System.out.println("The rotated array by inplace technique is :");
        rotateArrayInPlace(arr,k);
        printArray(ans);

    }
}
