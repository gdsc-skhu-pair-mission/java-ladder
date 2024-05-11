package ladder.model;

import java.util.ArrayList;
import java.util.List;

public class ManipulationPeople {

    private static final int BLOCK_DIGIT = 6;
    private static final int MAX_NAME_DIGIT = 5;
    private final List<String> manipulationPeopleNames = new ArrayList<>();

    public ManipulationPeople(List<Person> personList) {
        manipulateNames(personList);
    }

    public List<String> getManipulationPeopleNames() {
        return manipulationPeopleNames;
    }

    private void manipulateNames(List<Person> personList) {
        for (Person person : personList) {
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
