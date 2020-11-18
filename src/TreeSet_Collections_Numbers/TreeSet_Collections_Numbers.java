package TreeSet_Collections_Numbers;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Collections_Numbers {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<Integer>();

        numbers.add(7);
        numbers.add(23);
        numbers.add(0);
        numbers.add(3);
        numbers.add(10);
        numbers.add(8);

        for (Integer num : numbers) {
            System.out.println(num);
        }

        System.out.println(numbers.first());
        System.out.println(numbers.last());

        SortedSet<Integer> set = numbers.subSet(0, 10);
        System.out.println(set);

        NavigableSet<Integer> navSet = numbers.descendingSet();
        System.out.println(navSet);

        SortedSet<Integer> setLower = numbers.headSet(10);
        System.out.println(setLower);

        SortedSet<Integer> setGreater = numbers.tailSet(7);
        System.out.println(setGreater);

    }
}
