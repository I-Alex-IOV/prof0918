package util;

/**
 * Created by Maria on 22.09.2018.
 */
public class CharCounter {
    public static Integer countWhitespaces(String line) {
        Integer whitespaceCounter = 0;
        if (line != null)
            for (int i = 0; i < line.length(); i++)
                if (line.charAt(i) == ' ' || line.charAt(i) == '\t' || line.charAt(i) == '\n')
                    whitespaceCounter++;
        return whitespaceCounter;
    }
}
