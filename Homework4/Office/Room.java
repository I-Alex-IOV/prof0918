package hw_collections.Office;

/**
 * Created by Maria on 09.11.2018.
 */
class Room {
    static final Integer ROWS_NUMBER = 5;
    static final Integer SEATS_PER_ROW = 10;
    private boolean places[][] = new boolean[ROWS_NUMBER][SEATS_PER_ROW];

    boolean takeSeat(Integer row, Integer seat) {
        boolean result = true;
        if (row < 0 || seat < 0)
            result = false;
        else if (row >= ROWS_NUMBER || seat >= SEATS_PER_ROW)
            result = false;
        else if (places[row][seat])
            result = false;
        else
            places[row][seat] = true;
        return result;
    }
}
