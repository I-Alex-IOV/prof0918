package hw_collections;

import hw_collections.Office.CashDesk;
import hw_collections.Office.Ticket;
import hw_collections.Person.Person;
import hw_collections.Person.Sex;

import java.util.*;

/**
 * Created by Maria on 26.10.2018.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Person> queue = new ArrayList<>();
        Listener listener = new Listener(queue);
        listener.verbose = true;

        // Task 1 - comparable
        listener.add(new Person("Lady Pennybottom", Sex.LADY, 3));
        listener.add(new Person("Sir Lancelot", Sex.GENTLEMAN, 5));
        listener.add(new Person("Madam Lacely", Sex.LADY, 20));
        listener.add(new Person("Mister Coldby", Sex.GENTLEMAN, 2));
        listener.add(new Person("Miss Higgs", Sex.LADY, 100));
        listener.add(new Person("Miss Giggs", Sex.LADY, 1));


        // Task 1 - comparator
        System.out.println("===========================");
        ArrayList<Person> comparatorQueue = new ArrayList<>();
        Listener comparatorListener = new Listener(comparatorQueue, new QueueComparator());
        comparatorListener.verbose = true;
        comparatorListener.add(new Person("Lady Pennybottom", Sex.LADY, 3));
        comparatorListener.add(new Person("Sir Lancelot", Sex.GENTLEMAN, 5));
        comparatorListener.add(new Person("Madam Lacely", Sex.LADY, 20));
        comparatorListener.add(new Person("Mister Coldby", Sex.GENTLEMAN, 2));
        comparatorListener.add(new Person("Miss Higgs", Sex.LADY, 100));
        comparatorListener.add(new Person("Miss Giggs", Sex.LADY, 1));

        //Task 2.0
        CashDesk cashDesk = new CashDesk(comparatorQueue);
        cashDesk.printMap();

        //Task 2.1
        cashDesk.givePrize();

        //Task 3.0
        HashSet<Person> bestClients = findBestClients(cashDesk.getResult());
        if (bestClients == null)
            System.out.println("Nobody bought more than 1 ticket :(");
        else {
            for (Person p : bestClients) {
                System.out.println(p.getName());
            }
        }

        System.out.println();
        //Task 4.0
        if (bestClients == null)
            bestClients = new HashSet<>();
        bestClients.add(new Person("Rogue 1", Sex.GENTLEMAN, 0));
        bestClients.add(new Person("Rogue 2", Sex.LADY, 0));
        for (Person p : bestClients) {
            System.out.println(p.getName());
        }
    }

    private static HashSet<Person> findBestClients(HashMap<Person, ArrayList<Ticket>> values) {
        HashSet<Person> result = new HashSet<>();
        Set<Person> persons = values.keySet();
        persons.stream()
                .filter(p -> values.get(p).size() > 1)
                .forEach(result::add);
        return result;
    }

}
