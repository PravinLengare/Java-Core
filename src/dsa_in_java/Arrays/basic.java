package dsa_in_java.Arrays;

public class basic {
    static void demoMultiDimention() {
        //int arr1[][];
        int arr2[][] = {{23,43,22},{33,54,25},{27,35,76}};


        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);
        System.out.println(arr2[2][0]);
        System.out.println(arr2[2][1]);
        System.out.println(arr2[2][2]);

        // Accessing the elements by the loop

        for (int i = 0 ;i < arr2.length ; i++){

            for (int j = 0 ; j < arr2[i].length ; j++){

                System.out.println(arr2[i][j]);
            }
        }
    }
    static void  demo(){

        int ages[];
        ages = new int[4];
        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 30;
        ages[3] = 40;
        String names[] = {"Pravin","Sanjay","Lengare"};
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        // For knowing the length of the array then simply you can apply the function of length
        System.out.println(ages.length);
        System.out.println(names.length);

        // Accessing elements by for loop

        for (int i = 0; i < ages.length ; i++){

            System.out.println(ages[i]);
        }

        // Accessing elements by the for each loop

        for (int x : ages){

            System.out.println(x);
        }


        // Accessing the elements by the while loop

        int i = 0;
        while(i < ages.length){

            System.out.println(ages[i]);
            i++;
        }


    }
    public static void main(String[] args) {
        //basic.demo();
       basic.demoMultiDimention();
    }
}
