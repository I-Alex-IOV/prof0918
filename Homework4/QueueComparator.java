package hw_collections;

import hw_collections.Person.Person;
import hw_collections.Person.Sex;

import java.util.Comparator;

/**
 * Created by Maria on 02.11.2018.
 */
class QueueComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return (o1.getSex() == o2.getSex() ? (o2.getRespect() > o1.getRespect() ? 1 : -1) : (o2.getSex() == Sex.LADY ? 1 : -1));
    }
}
