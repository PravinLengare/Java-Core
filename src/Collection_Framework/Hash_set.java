package Collection_Framework;

import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet(22,0.5f);  // Constuctor of Hashset....
        HashSet<Integer> m = new HashSet();
        // methods of hashset

        myhashset.add(3);
        myhashset.add(2);
        // myhashset.clear(); // Used to remove all the elements from the set.

        System.out.println(myhashset.contains(2)); // Used to return true if an element is present in a set.

        System.out.println(myhashset.remove(3)); // Used to remove the element if it is present in set.
        System.out.println(myhashset.isEmpty());    // Used to check whether the set is empty or not. Returns true for empty and false for a non-empty condition for set.
        System.out.println("The  size of  hashset  is  "+myhashset.size()); // Used to return the size of the set.
        System.out.println(myhashset.clone());

        System.out.println("The  elements in  hashset are :"+ myhashset);

    }
}
