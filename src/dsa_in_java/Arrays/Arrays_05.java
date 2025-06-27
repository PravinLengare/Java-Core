package dsa_in_java.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_05 {

    static void sortZerosAndOnes(int []arr){

        int n = arr.length;
        int zeros = 0;

        for (int i = 0 ; i < n ; i++){

            if(arr[i] == 0){

                zeros++;
            }
        }
        for (int i = 0; i < zeros - 1; i++){

            arr[i] = 0;
        }
        for (int i = zeros; i <= n - 1; i++){

            arr[i] = 1;
        }

    }
    static void sortZerosByPointer(int []arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while(l < r){

          if(arr[l] == 1 && arr[r] == 0){

                swap(l,r,arr);
                l++;
                r--;
            }
          else if (arr[l] == 0) {
              l++;

          }
          else if (arr[r] == 1) {
              r--;

          }

        }
    }
    static void sortEvenOddNumber(int []arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while(l < r){

            if(arr[l]%2!=0 && arr[r]%2==0){

                swap(l,r,arr);
                l++;
                r--;
            }
            else if(arr[l]%2==0){
                l++;
            }
            else if(arr[r]%2!=0) {
                 r--;
            }

         }
    }
    static int [] sortSquareNu(int []arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int ans[] = new int[n];
        int k = n - 1;

        while(l <= r){

            if(Math.abs(arr[l]) > Math.abs(arr[r])) {
                ans[k--] =  arr[l] *  arr[l];
                l++;
            }
            else {
                ans[k--] = arr[r] * arr[r];
                r--;
            }

        }
        return ans;
    }
    static void swap(int l,int r,int []arr){
        int t;
        t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
    static void printArray(int []arr){

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void reverseArray1(int []arr,int l,int r){
        int n = arr.length;
//        int i = 0;
//        int j = n - 1;

        while (l < r){
            swap(l,r ,arr);
            l++;
            r--;
        }

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

//        System.out.println("The sorted array which contains 0s and 1s is :");
//        Arrays_05.sortZerosAndOnes(arr);
//        Arrays_05.printArray(arr);
//
//        // Second approach for this code
//        Arrays_05.sortZerosByPointer(arr);
//        Arrays_05.printArray(arr);
//
//
//
//        // For the even no in front of the array and odd after that
//        System.out.println("For the sorted array of even and odd numbers is :");
//        Arrays_05.sortEvenOddNumber(arr);
//        Arrays_05.printArray(arr);

        // For non-decreasing the array with square of no
        System.out.println("The sorted array of the negative and positive no in the non-decreasing order is :");
         int ans[] = sortSquareNu(arr);
        // reverseArray1(ans,l,r);
        Arrays_05.printArray(ans);
    }
}
