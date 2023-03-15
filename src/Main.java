package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Иван", "Иванов", 20));
        people.add(new Person("Педро", "Карлос Родригос де Кастильо", 40));
        people.add(new Person("Хуан", "Карлос Родригос де Кастильо", 20));
        people.add(new Person("Махмуд", "Курлы Оглы Маглы", 45));

        System.out.println(people);


        Comparator<Person> comparator = (o1, o2) -> {
            int length1 = Math.min(o1.surname.split(" ").length, 3);
            int length2 = Math.min(o2.surname.split(" ").length, 3);
            if (length1 > length2) {
                return 1;
            } else if (length1 < length2 ) {
                return -1;
            } else {
                return Integer.compare(o1.age, o2.age);
            }
        };

        Collections.sort(people, comparator);
        System.out.println(people);

    }
}
