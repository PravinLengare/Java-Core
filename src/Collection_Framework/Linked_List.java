package Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.addFirst(234);

        l2.addLast(3333);  // this function not in the arraylist methods

        l2.add(10);
        l2.add(16);
        l2.add(19);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(0, 4);
        l1.add(0, 1);
        l1.addAll(0, l2);                        // if we give the index then it will accordingly do the job....

        // l1.clear();                               // it clears the all elements in list

        System.out.println(l1.contains(47));        // return the true if the ele is present

        System.out.println(l1.indexOf(4));          // give the first index of ele

        System.out.println(l1.lastIndexOf(4));  // give the last index of ele

        l1.set(1, 114);                             // set the element in that specific position.
        for (int i = 0; i < l1.size(); i++) {

            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
