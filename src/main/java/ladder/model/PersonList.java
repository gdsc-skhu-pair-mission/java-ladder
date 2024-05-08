package ladder.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ladder.util.validator.PersonValidator;

public class PersonList {

    private static final int BLOCK_DIGIT = 6;
    private static final int MAX_NAME_DIGIT = 5;
    private String nameList;
    private List<Person> people = new ArrayList<>();
    private final List<String> manipulationPeopleNames = new ArrayList<>();

    public PersonList(String nameList) {
        PersonValidator.checkDuplicate(nameList);

        this.nameList = nameList;
    }

    public void personNameInput() {
        for (String personName :Arrays.asList(nameList.split(","))) {
            people.add(new Person(personName));
        }
    }

    public List<Person> getPeople(){
        return people;
    }

    public List<String> getManipulationPeopleNames() {
        return manipulationPeopleNames;
    }

    public void manipulateNames() {
        for (Person person : people) {
            manipulationPeopleNames.add(manipulateNameBlank(person.getName()));
        }
    }

    private String manipulateNameBlank(String name) {
        int blankNumber = BLOCK_DIGIT - name.length();
        StringBuilder manipultionName = new StringBuilder();

        if (name.length() == MAX_NAME_DIGIT) {
            manipultionName.append(" ");
        }

        for (int i = 0; i < blankNumber - 1; i++) {
            manipultionName.append(" ");
        }
        manipultionName.append(name);

        if (name.length() != MAX_NAME_DIGIT) {
            manipultionName.append(" ");
        }

        return manipultionName.toString();
    }
}
