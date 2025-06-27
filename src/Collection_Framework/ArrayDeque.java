package Collection_Framework;
import java.util.*;
public class ArrayDeque {
    public static void main(String[] args) {


        java.util.ArrayDeque<Integer> ad1 =  new java.util.ArrayDeque<>();
        ad1.add(3);
        ad1.add(4);
        ad1.add(5);
        ad1.addFirst(1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
