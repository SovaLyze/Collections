package HashMap_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {

    private String name;
    private Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1,"Poland");
        states.put(2,"Ukraine");
        states.put(3,"Germany");
        states.put(4,"France");
        states.put(5,"Spain");

        // get object by key 2
        String first = states.get(2);
        System.out.println(first);
        // get the whole set of keys
        Set<Integer> keys = states.keySet();
        // get a set of all values
        Collection<String> values = states.values();
        // replace element
        states.replace(5, "Italy");
        // deleting an element by key 2
        states.remove(4);
        // iteration over elements
        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1", new Person("Tom"));
        people.put("2", new Person("Bill"));
        people.put("3", new Person("Nick"));

        for (Map.Entry<String, Person> item : people.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

