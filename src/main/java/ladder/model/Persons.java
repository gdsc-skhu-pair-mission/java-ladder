package ladder.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ladder.util.validator.PersonValidator;

public class Persons {

    private List<Person> people = new ArrayList<>();

    public Persons(String nameList) {
        PersonValidator.checkDuplicate(nameList);
        personNameInput(nameList);
    }

    public List<Person> getPeople(){
        return Collections.unmodifiableList(people);
    }

    private void personNameInput(String nameList) {
        for (String personName : Arrays.asList(nameList.split(","))) {
            people.add(new Person(personName));
        }
    }
}
