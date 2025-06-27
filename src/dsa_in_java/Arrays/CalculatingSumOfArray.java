package dsa_in_java.Arrays;

import java.util.Scanner;

public class CalculatingSumOfArray {

    static void addArray(){
        int arr[] = {1,2,3,4};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){

            sum+= arr[i];
        }
        System.out.println("The sum of array is :"+sum);

    }


    static void maxOfArray(){
        int arr[] = {1,2,3,4};
        int max = 0;
        for (int i = 0; i < arr.length ; i++ ){

            if(arr[i] > max){

                max = arr[i];
            }
        }
        System.out.println("The max of the array will be :"+max);
    }

    static void searchElement(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){                           // here I learnt the how to input from the user.
            arr[i] = s.nextInt();

        }
        System.out.println("Enter the element you want to search: ");
        int key = s.nextInt();
        int ans = -1;
        int i;
        for (i = 0; i < arr.length; i++){
            if (arr[i] == key){
                 ans = i;
                 break;
            }

        }
        System.out.printf("The element %d found at index %d ",arr[i],ans);  // used the printf function for formatting the output.

    }
    public static void main(String[] args) {

        CalculatingSumOfArray.addArray(); // Without creating the object of the class and using the static method.
        CalculatingSumOfArray.maxOfArray(); // for finding the maximum of array
        CalculatingSumOfArray.searchElement(); // for the searching the element in the array
    }
}
