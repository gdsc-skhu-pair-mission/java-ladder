package ladder.model;

import static ladder.util.validator.PersonValidator.checkDuplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonList {

    private final List<Person> people = new ArrayList<>();

    public PersonList(String nameList) {
        checkDuplicate(nameList);
        personNameInput(nameList);
    }

    public List<Person> getPeople() {
        return Collections.unmodifiableList(people);
    }

    private void personNameInput(String nameList) {
        for (String personName : nameList.split(",")) {
            people.add(new Person(personName));
        }
    }
}
