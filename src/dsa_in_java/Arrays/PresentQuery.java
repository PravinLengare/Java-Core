package dsa_in_java.Arrays;

import java.util.Scanner;

public class PresentQuery {
//    static void isPresentQuery(int arr[]){
//
//
//    }
    static int[] makeFrequencyArray(int arr[]){

        int freq[] = new int[100005];
        for (int i = 0 ; i < arr.length ; i++){

            freq[arr[i]]++;
        }
        return freq;
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
        int fre[] = makeFrequencyArray(arr);

        System.out.println("Enter the no of queries:");
        int q = s.nextInt();

        while(q > 0){
            System.out.println("Enter no to be searched:");
            int x = s.nextInt();
            if(fre[x] > 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
