package marker;

/**
 * Created by Maria on 22.09.2018.
 */
public class Chalk extends WastableWriter {

    public Chalk() {
        this.inkPerLetter = 0.03;
    }

    @Override
    public void write(String line) {
        System.out.printf("Writing with chalk: ");
        super.write(line);
    }
}
