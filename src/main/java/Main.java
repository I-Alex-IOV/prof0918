import marker.Chalk;
import marker.Marker;
import teacher.Teacher;
import util.Color;

/**
 * Created by Maria on 22.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher();
        Marker redMarker = new Marker(Color.RED);

        for (int i = 0; i < 5; i++) {
            myTeacher.writeOnBoard(redMarker);
            System.out.println(redMarker.getInk());
        }

        Chalk chalk = new Chalk();

        for (int i = 0; i < 5; i++) {
            myTeacher.writeOnBoard(chalk);
            System.out.println(chalk.getInk());
        }

        System.out.println("Marker ink per letter: " + redMarker.getInkPerLetter());
        System.out.println("Chalk ink per letter: " + chalk.getInkPerLetter());
    }
}
