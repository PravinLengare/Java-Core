package dsa_in_java.Arrays;

import java.util.Arrays;

public class Reference {
    static void create_Clone(int []arr){
        int []arr2 = arr.clone();
        System.out.println(arr2);
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 6;
        System.out.println("After making changes in arr2:");
        System.out.println(arr2);
        System.out.println("After making changes in arr2 arr is :");
        System.out.println(arr);
    }
    static void change_Array(int []arr){

        for(int i = 0; i < arr.length ; i++){

             arr[i] = 0;
        }

    }
    static void printArray(int []arr){

        for(int i = 0; i < arr.length ; i++){

            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        /*
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Original array:");
        Reference.printArray(arr);

        // making the copy of array
        int []arr1 = arr;  // This will create the shallow copy
        System.out.println("Array of copied arr1");
        Reference.printArray(arr1);
        arr1[0] = 0;
        arr1[1] = 9;
        System.out.println("After changing elements of copied array of arr1:");
        Reference.printArray(arr1);
        System.out.println("After changing elements of copied array of arr:");
        Reference.printArray(arr);
        Reference.change_Array(arr);

         */

        // making by the deep copy


        /*
        System.out.println("Original arr :");
        Reference.printArray(arr);
        int []arr2 = arr.clone(); // This method will make the deep copy of array.
        System.out.println("After copied values of arr in arr2:");
        Reference.printArray(arr2);
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 6;
        System.out.println("After making changes in arr2:");
        Reference.printArray(arr2);
        System.out.println("After making changes in arr2 arr is :");
        Reference.printArray(arr);

         */

        // 1.making by the method of arrays
        /*
        int arr2[] = Arrays.copyOf(arr,arr.length);  // it will take the two parameters first is array which we have to copy and second is what is length for the copy.
        Reference.printArray(arr2);
        Reference.printArray(arr);


         */

        // 2.making by the method of arrays copy of range

        /*
        int arr2[] = Arrays.copyOfRange(arr,0,2);
        Reference.printArray(arr2);
        Reference.printArray(arr);

         */



    }
}
