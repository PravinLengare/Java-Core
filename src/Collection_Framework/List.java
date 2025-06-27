package Collection_Framework;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class List {
    public static void main(String[] args) {
        // ArrayList<String> l = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int  n = s.nextInt();

        Vector<Integer> v = new Vector<Integer>(n); // Importing  the vector class

        for (int i =1 ;i <= n;  i++){
            v.add(i);
        }

        System.out.println(v);
        v.remove(3);
        // after removing the ele
        System.out.println(v);

//        for (int i = 0; i <v.size();i++){
//            System.out.print(v.get(i)+" ,");
//        }

        System.out.println(v.get(3));  // this for accessing the ele in vector
    }
}
