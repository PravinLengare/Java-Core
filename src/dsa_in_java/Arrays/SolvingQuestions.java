package dsa_in_java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SolvingQuestions {
    static void calOccurance(int []arr){
        Scanner s = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number to find its occurance:");
        int x = s.nextInt();
        for(int i = 0 ; i < arr.length ; i++){

            if (arr[i] == x){
                count++;
            }
        }
        //return count;
        System.out.println("The occurence of the number is :"+count);
    }
    static int  lastOccurance(int []arr){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find its last index of occurance:");
        int y = s.nextInt();
        int lastIndex = -1;
        for(int i = 0 ; i < arr.length ; i++){

            if (arr[i] == y){

                lastIndex = i;
            }
        }
        return lastIndex;

    }
    static int countNumber(int []arr){
        Scanner s = new Scanner(System.in);
        int count = 0;
        int z = s.nextInt();
        for(int i = 0 ; i < arr.length ; i++){

            if (arr[i] > z){

                count++;
            }
        }
        return count;

    }

    static boolean isSort(int []arr){

        boolean check = true;

        for (int i = 1 ; i < arr.length ; i ++){                               // we can do mistake here so be carefully.

            if (arr[i-1] > arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }

    static int [] smallestAndLargestElement(int []arr){    // I have made code for the k^th smallest and largest in the array.
        Arrays.sort(arr);
        System.out.println("The sorted array is :");
        for(int i = 0; i < arr.length; i++){

            System.out.println(arr[i]);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of k th :");
        int k = s.nextInt();
        int []ans = {arr[k-1], arr[arr.length - k]};
//        c[0] = arr[0];
//        c[1] =  arr[arr.length - 1];

        return ans;
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
         SolvingQuestions.calOccurance(arr);

        //   Return the last occurence of the element

                System.out.println("The last index of the element is :"+SolvingQuestions.lastOccurance(arr));

         //  Count the no strictly greater than x;

                System.out.println("The count of the number is :"+SolvingQuestions.countNumber(arr));

         //  Checking the array if it is sorted or not .

                System.out.println("The ans is :"+SolvingQuestions.isSort(arr));


         //  Q. 4 Calculating the smallest and the largest element of the array and return it with array ?


        int []ans = SolvingQuestions.smallestAndLargestElement(arr);
        System.out.println("The smallest element is :"+ans[0]);
        System.out.println("The largest element is :"+ans[1]);

    }
}
