package ladder.view;

import ladder.model.Person;
import java.util.ArrayList;
import java.util.List;

public class NameManipulateView {

    private static final int BLOCK_DIGIT = 6;
    private static final int MAX_NAME_DIGIT = 5;

    public List<String> manipulateNames(List<Person> personList) {
        List<String> manipulatedNames = new ArrayList<>();
        for (Person person : personList) {
            manipulatedNames.add(manipulateNameBlank(person.getName()));
        }
        return manipulatedNames;
    }

    private String manipulateNameBlank(String name) {
        int blankNumber = BLOCK_DIGIT - name.length();
        StringBuilder manipulatedName = new StringBuilder();

        if (name.length() == MAX_NAME_DIGIT) {
            manipulatedName.append(" ");
        }

        for (int i = 0; i < blankNumber - 1; i++) {
            manipulatedName.append(" ");
        }
        manipulatedName.append(name);

        if (name.length() != MAX_NAME_DIGIT) {
            manipulatedName.append(" ");
        }
        return manipulatedName.toString();
    }
}
