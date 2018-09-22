package marker;

import util.CharCounter;

/**
 * Created by Maria on 22.09.2018.
 */
public abstract class WastableWriter implements Writer {
    private Double ink = 1.0;
    Double inkPerLetter;

    public void write(String line) {

        Double neededInk = (line.length() - CharCounter.countWhitespaces(line)) * this.inkPerLetter;

        if (this.ink >= neededInk) {
            System.out.println(line);
            this.ink -= neededInk;
        } else {
            System.out.println("Can't write: not enough ink.");
        }
    }

    public Double getInk() {
        return ink;
    }

    public Double getInkPerLetter() {
        return inkPerLetter;
    }
}
