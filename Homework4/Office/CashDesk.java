package hw_collections.Office;

import hw_collections.Person.Person;
import hw_collections.Person.Sex;
import lombok.Getter;

import java.util.*;

/**
 * Created by Maria on 02.11.2018.
 */
@Getter
public class CashDesk {

    private HashMap<Person, ArrayList<Ticket>> result;
    public static final Integer MAX_NUMBER_OF_TICKETS_PER_PERSON = 10;
    private Room room;
    private ArrayList<Person> queue;

    public CashDesk(ArrayList<Person> queue) {
        this.queue = queue;
        this.room = new Room();
        getTickets();
    }

    private void getTickets() {
        result = new HashMap<>();

        Iterator<Person> iterator = queue.iterator();
        iterator.forEachRemaining(s -> {
            Integer numberOfTickets = 1 + new Random().nextInt(MAX_NUMBER_OF_TICKETS_PER_PERSON);
            ArrayList<Ticket> tickets = new ArrayList<>();
            for (int i = 0; i < numberOfTickets; i++) {
                Ticket ticket = Ticket.generateNewTicket(room);
                if (ticket == null)
                    break;
                tickets.add(ticket);
            }
            result.put(s, tickets);
        });
    }

    public void printMap() {
        for (Person p : queue) {
            ArrayList<Ticket> tickets = result.get(p);
            System.out.print("Cashdesk: the client " + p.getName() + " bought "
                    + tickets.size() + " tickets\n");
            if (tickets.size() > 0) {
                System.out.println("Those are:\n");
                for (Ticket t : tickets) {
                    System.out.println("\t Row: " + (t.getRow() + 1) + "; Seat: " + (t.getSeat() + 1));
                }
            }
        }
    }

    public void givePrize() {
        Person lady = null, gentleman = null;

        for (Person p : queue) {
            if (p.getSex() == Sex.LADY) {
                if (lady == null) lady = p;
                else if (lady.getRespect() > p.getRespect()) lady = p;
            } else {
                if (gentleman == null) gentleman = p;
                else if (gentleman.getRespect() > p.getRespect()) gentleman = p;
            }
        }
        if (lady != null) {
            ArrayList<Ticket> winningTickets = result.get(lady);
            if (winningTickets == null) System.out.println("Winning lady has no tickets!");
            else {
                winningTickets.get(0).setWin(true);
                System.out.println("Congratulations to " + lady.getName() + " with "
                        + lady.getRespect() + " brouches! Her ticket ("
                        + (winningTickets.get(0).getRow() + 1) + ";" + (winningTickets.get(0).getSeat() + 1) + ")"
                        + " wins!");
            }
        } else
            System.out.println("No winning tickets for ladies :(");

        if (gentleman != null) {
            ArrayList<Ticket> winningTickets = result.get(gentleman);
            if (winningTickets == null) System.out.println("Winning gentleman has no tickets!");
            else {
                winningTickets.get(0).setWin(true);
                System.out.println("Congratulations to " + gentleman.getName() + " with moustache length of "
                        + gentleman.getRespect() + "! His ticket ("
                        + (winningTickets.get(0).getRow() + 1) + ";" + (winningTickets.get(0).getSeat() + 1) + ")"
                        + " wins!");
            }
        } else
            System.out.println("No winning tickets for gentlemen :(");

    }
}
