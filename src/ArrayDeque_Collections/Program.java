package ArrayDeque_Collections;

import java.util.ArrayDeque;

class Person {
    private String name;
    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}

public class Program {

    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.addFirst("France"); // adding element to start
        states.push("Great Britain"); // adding element to start
        states.addLast("Spain"); // adding element to end
        states.add("Italy");

        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        System.out.printf("Queue size: %d \n", states.size());


        while (states.peek() != null) {
            System.out.println(states.pop());
        }

        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for(Person p : people) {
            System.out.println(p.getName());
        }
    }
}
