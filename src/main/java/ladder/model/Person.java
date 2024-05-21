package ladder.model;

import static ladder.util.validator.PersonValidator.checkEmpty;
import static ladder.util.validator.PersonValidator.checkOverRange;
import static ladder.util.validator.PersonValidator.checkSpace;

public class Person {

    private String name;

    public Person(String name) {
        checkEmpty(name);
        checkOverRange(name);
        checkSpace(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
