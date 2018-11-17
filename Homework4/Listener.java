package hw_collections;

import hw_collections.Person.Person;
import hw_collections.Person.Sex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Maria on 26.10.2018.
 */
class Listener {
    private ArrayList<Person> queue;
    private Comparator<Person> queueComparator;
    boolean verbose = false;

    Listener(ArrayList<Person> queue) {
        this.queue = queue;
        queueComparator = null;
    }

    Listener(ArrayList<Person> queue, Comparator<Person> queueComparator) {
        this.queue = queue;
        this.queueComparator = queueComparator;
    }

    void add(Person newPerson) {
        queue.add(newPerson);
        if (queueComparator == null)
            Collections.sort(queue);
        else
            Collections.sort(queue, queueComparator);
        if (verbose) {
            System.out.println("New queue is:");
            displayQueue();
        }
    }

    private void displayQueue() {
        for (Person p : queue) {
            Sex s = p.getSex();
            System.out.print("Name: " + p.getName() + "; ");
            if (s.equals(Sex.LADY))
                System.out.println("Sex: Lady; Number of brouches:" + p.getRespect());
            else
                System.out.println("Sex: Gentleman; Moustache length:" + p.getRespect());
        }
    }


}
