package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Иван", "Иванов", 17));
        people.add(new Person("Педро", "Карлос Родригос де Кастильо", 18));
        people.add(new Person("Хуан", "Карлос Родригос де Кастильо", 17));
        people.add(new Person("Махмуд", "Курлы Оглы Маглы", 45));

        System.out.println(people);

        people.removeIf(o -> (o.getAge() < 18));
        System.out.println(people);
    }
}
