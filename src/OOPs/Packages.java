package OOPs;
// import java.util.Scanner;

// import java.util.*;
public class Packages {
    public static void main(String[] args) {

        // Scanner c = new Scanner(System.in);
        java.util.Scanner s = new java.util.Scanner(System.in);  // without using package
        int a = s.nextInt();
        System.out.println("The entered no is "+ a);
    }
}
