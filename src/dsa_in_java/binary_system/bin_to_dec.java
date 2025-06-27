package dsa_in_java.binary_system;

import java.util.Scanner;

public class bin_to_dec {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//        int binary_no = s.nextInt();
//        int power = 1;
//        int ans = 0;
//
//        while (binary_no > 0){
//            int unit_digit = binary_no%10;
//            ans+= unit_digit*(power);
//            binary_no/=10;
//            power*=2;
//        }
//        System.out.println("The ans is in decimal is: "+ans);
        int decimal_number = s.nextInt();
        int ans = 0;
        int power = 1;

        while (decimal_number > 0){

            int pariy = decimal_number % 2;
            ans+= (pariy * power);
            power*=10;
            decimal_number/=2;
        }
        System.out.println("The decimal in"+ans);
    }
}
