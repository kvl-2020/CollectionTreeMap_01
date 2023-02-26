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
        int length1 = Math.min(o1.surname.split(" ").length, importanteCount);
        int length2 = Math.min(o2.surname.split(" ").length, importanteCount);
        if (length1 > length2) {
            return 1;
        } else if (length1 < length2 ) {
            return -1;
        } else {
            return Integer.compare(o1.age, o2.age);
        }
    }

}
