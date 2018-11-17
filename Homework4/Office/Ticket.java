package hw_collections.Office;

import com.sun.istack.internal.Nullable;
import lombok.Getter;

import java.util.Random;

/**
 * Created by Maria on 09.11.2018.
 */
@Getter
public class Ticket {
    private static Integer ticketCounter = 1;
    private Integer ticketNumber;
    private Integer seat;
    private Integer row;
    private boolean win = false;

    Ticket(Integer row, Integer seat) {
        this.seat = seat;
        this.row = row;
        ticketNumber = ticketCounter;
        ticketCounter++;
    }

    @Nullable
    static Ticket generateNewTicket(Room room) {
        if (ticketCounter > (Room.ROWS_NUMBER * Room.SEATS_PER_ROW)) {
            return null;
        }
        Random r = new Random();
        Integer row = -1, seat = -1;
        while (!room.takeSeat(row, seat)) {
            row = r.nextInt(Room.ROWS_NUMBER);
            seat = r.nextInt(Room.SEATS_PER_ROW);
        }
        return new Ticket(row, seat);
    }

    void setWin(boolean newValue) {
        this.win = newValue;
    }
}