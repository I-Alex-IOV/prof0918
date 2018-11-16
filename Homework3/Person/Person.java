package hw_collections.Person;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Maria on 02.11.2018.
 */
@AllArgsConstructor
@Getter
public class Person implements Comparable {
    private String name;
    private Sex sex;
    private int respect;

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getRespect() {
        return respect;
    }

    @Override
    public int compareTo(Object o) {
        int result = 0;
        if (o.getClass() == getClass()) {
            if (((Person) o).getSex() == sex)
                result = ((Person) o).getRespect() > respect ? 1 : -1;
            else
                result = ((Person) o).getSex() == Sex.LADY ? 1 : -1;
        }
        return result;
    }
}
