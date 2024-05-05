package util.validator;

import static util.ErrorMessage.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class PersonValidator {

    private static final int MAX_DIGIT_PERSON_NAME = 5;
    private static final int MIN_DIGIT_PERSON_NAME = 1;

    public static void checkOverRange(String input) {
        if (isOverRange(input) || isUnderRange(input)) {
            throw new IllegalArgumentException(INPUT_PERSON_NAME_IS_INCORRECT.message);
        }
    }

    public static void checkSpace(String input) {
        if (isSpace(input)) {
            throw new IllegalArgumentException(INPUT_STRING_BLANK.message);
        }
    }

    public static void checkEmpty(String input) {
        if (input == null) {
            throw new IllegalArgumentException(INPUT_STRING_NOT_NULL.message);
        }
    }

    public static void checkDuplicate(String input) {
        if (hasDuplicatePersonName(input)) {
            throw new IllegalArgumentException(INPUT_STRING_DUPLICATE.message);
        }
    }

    private static boolean isOverRange(String input) {
        return MAX_DIGIT_PERSON_NAME < input.length();
    }

    private static boolean isUnderRange(String input) {
        return MIN_DIGIT_PERSON_NAME > input.length();
    }

    private static boolean isSpace(String input) {
        return Pattern.matches("^\\s+$", input);
    }

    private static boolean hasDuplicatePersonName(String input) {
        List<String> allPersonNames = new ArrayList<>(Arrays.asList(input.split(",")));
        Set set = new HashSet(allPersonNames);

        return allPersonNames.size() != set.size();
    }

}
