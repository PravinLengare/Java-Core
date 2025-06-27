package basic_of_java;

import java.util.Scanner;

public class samleforcoonsumenextline {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //scan.nextLine(); // Consume the leftover newline character

        // Read a double
        double d = scan.nextDouble();
        //scan.nextLine(); // Consume the leftover newline character

        int a =scan.nextInt();
        // Read a string
        char s = scan.next().charAt(0);
        //String s = scan.nextLine();

        // Print the output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        byte k = 24;
        int b = k;
        char s1 = 'p';
        int l = s1;
        System.out.println(l);

        System.out.println(b);
        System.out.println(k);
    }
}
