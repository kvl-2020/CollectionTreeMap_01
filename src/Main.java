package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Иван", "Иванов", 20));
        people.add(new Person("Педро", "Карлос Родригос де Кастильо", 40));
        people.add(new Person("Хуан", "Карлос Родригос де Кастильо", 20));
        people.add(new Person("Махмуд", "Курлы Оглы Маглы", 45));

        System.out.println(people);

        Collections.sort(people, new PersonStatusComparator(3));
        System.out.println(people);

        Collections.sort(people, new PersonStatusComparator());
        System.out.println(people);

    }
}
