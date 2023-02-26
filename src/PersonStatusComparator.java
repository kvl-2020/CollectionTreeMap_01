package src;

import java.util.Comparator;

public class PersonStatusComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        //return Integer.compare(o1.surname.split(" ").length, o2.surname.split(" ").length);
        int length1 = o1.surname.split(" ").length;
        int length2 = o2.surname.split(" ").length;
        if (length1 > length2) {
            return 1;
        } else if (length1 < length2 ) {
            return -1;
        } else {
            return Integer.compare(o1.age, o2.age);
        }
    }
}
