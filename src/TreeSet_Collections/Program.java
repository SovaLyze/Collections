package TreeSet_Collections;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        TreeSet<String> states = new TreeSet<String>();

        states.add("Poland");
        states.add("Ukraine");
        states.add("Germany");
        states.add("United Kingdom");
        states.add("Italy");
        states.add("France");

        System.out.println(states.first()); // we get the first - the smallest element
        System.out.println(states.last()); // get the last - largest element
        // get a preset from one element to another
        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println(set);
        // an element from the set that is greater than the current one
        String greater = states.higher("Italy");
        System.out.println(greater);
        // element from the set that is less than the current one
        String lower = states.lower("Ukraine");
        System.out.println(lower);
        // return the set in reverse order
        NavigableSet<String> navSet = states.descendingSet();
        // return a set in which all elements are less than the current one
        SortedSet<String> setLower = states.headSet("Germany");
        // return a set in which all elements are greater than the current one
        SortedSet<String> setGreater = states.tailSet("Germany");

        System.out.println(navSet);
        System.out.println(setLower);
        System.out.println(setGreater);
    }
}
