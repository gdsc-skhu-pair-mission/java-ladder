package util.validator;

import static util.ErrorMessage.INPUT_PERSON_NAME_IS_INCORRECT;

public class PersonValidator {

    private static final int MAX_DIGIT_PERSON_NAME = 5;
    private static final int MIN_DIGIT_PERSON_NAME = 1;

    public static void checkOverRange(String input) {
        if (isOverRange(input) || isUnderRange(input)) {
            throw new IllegalArgumentException(INPUT_PERSON_NAME_IS_INCORRECT.message);
        }
    }

    private static boolean isOverRange(String input) {
        return MAX_DIGIT_PERSON_NAME < input.length();
    }

    private static boolean isUnderRange(String input) {
        return MIN_DIGIT_PERSON_NAME > input.length();
    }
}
