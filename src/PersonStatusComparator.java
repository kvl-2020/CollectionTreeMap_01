package src;

import java.util.Comparator;

public class PersonStatusComparator implements Comparator<Person> {

    private int importanteCount = Integer.MAX_VALUE;

    public PersonStatusComparator() {
    }

    public PersonStatusComparator(int importanteCount) {
        if (importanteCount > 0 ) {
            this.importanteCount = importanteCount;
        }
    }

    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.surname.split(" ").length > importanteCount ? importanteCount : o1.surname.split(" ").length;
        int length2 = o2.surname.split(" ").length > importanteCount ? importanteCount : o2.surname.split(" ").length;
        if (length1 > length2) {
            return 1;
        } else if (length1 < length2 ) {
            return -1;
        } else {
            return Integer.compare(o1.age, o2.age);
        }
    }

}
