package IteratorCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Program {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();

        states.add("Poland");
        states.add("Ukraine");
        states.add("France");
        states.add("Italy");
        states.add("Germany");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ListIterator<String> listIter = states.listIterator();

        while (listIter.hasNext()) {
            System.out.println(listIter.next());
        }

        listIter.set("Brazil");

        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }

    }
}
