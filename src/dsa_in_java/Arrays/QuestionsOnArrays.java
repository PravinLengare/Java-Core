package dsa_in_java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionsOnArrays {

    static int pairSum(int []arr){
        int ans = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of the sum:");
        int target = s.nextInt();
        for(int i = 0; i < arr.length ; i++){
            for( int j = i + 1; j < arr.length; j++){

                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    static int  tripletSum(int []arr){
        int ans = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of the sum:");
        int target = s.nextInt();
        for(int i = 0; i < arr.length ; i++){
            for( int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length ; k++){

                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }

            }
        }
        return ans;
    }
    static int uniqueNo(int []arr){

        for(int i = 0 ; i < arr.length ; i++){

            for (int j = i + 1; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;  // In Java, local variables must be explicitly initialized before they are used
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }

        return ans;
    }
    static int  maxNo(int []arr){

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // System.out.println("The maximum value is :"+max);
        return max;

    }
    static int isSecondLargest(int []arr){

//        Arrays.sort(arr);
//        System.out.println("The sorted array is :");
//        for(int i = 0 ; i < arr.length ; i++){
//
//            System.out.println(arr[i]);
//        }
//        int ans = arr[1];
//
//        return ans;
        int mx = maxNo(arr);
        for(int i = 0; i < arr.length ; i++){

            if(arr[i] == mx){

                 arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = maxNo(arr);
//        for (int i = 0 ; i < arr.length ; i++){
//
//            if(arr[i] > mx){
//
//                mx = arr[i];
//            }
//        }

        return secondMax;
    }
    static int minElement(int []arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;

    }
    static int secondSmallest(int []arr){
       int mi = minElement(arr);
        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i] == mi ){
                arr[i] = Integer.MAX_VALUE;
            }

        }
        int secondSmall = minElement(arr);

        return secondSmall;
    }
    static int  repeateNu(int []arr){

        for(int i = 0 ; i < arr.length ; i++){

            for (int j = i + 1; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    //  Please note This :: this is only assign the value of arr in the ans so we have to use return statement for the exit from the loop
                    return arr[i];
                }
            }
        }
        return -1;
    }
    static int repeateNum(int []arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length ; i++){

            for (int j = i + 1; j < arr.length; j++){

                if(arr[i] == arr[j]){

                    ans = arr[i];

                }
            }
        }
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


        /*
        System.out.println("The no of pairs to getting the sum is :"+ QuestionsOnArrays.pairSum(arr));

        // for the triplet it will be :->

        System.out.println("The no of triplets to getting the sum is :"+ QuestionsOnArrays.tripletSum(arr));

        // Finding the unique element in the array ----->

                //System.out.println("The unique element is :"+QuestionsOnArrays.uniqueNo(arr));

        // Second largest element in the array .

        System.out.println("The second largest ele is :"+QuestionsOnArrays.isSecondLargest(arr));

         // QuestionsOnArrays.maxNo(arr);
        // This is the question in which we have to return the value which is first repeated..
        System.out.println("The first repeated number is :"+QuestionsOnArrays.repeateNu(arr));
        // This is the question in which we have to return the value which is last repeated..
        System.out.println("The last repeated number is :"+QuestionsOnArrays.repeateNum(arr));

         */


        // for min element code is
        System.out.println("The min of the array is :"+QuestionsOnArrays.minElement(arr));
        // for finding the second smallest in the array
        System.out.println("The second smallest element is :"+QuestionsOnArrays.secondSmallest(arr));
    }
}
