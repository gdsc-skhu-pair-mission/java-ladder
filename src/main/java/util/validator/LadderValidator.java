package util.validator;

import java.util.regex.Pattern;

import static util.ErrorMessage.INPUT_LADDER_NUMBER;
import static util.ErrorMessage.INPUT_STRING_NOT_NULL;

public class LadderValidator {

    public static void checkEmpty(String input) {
        if (input == null) {
            throw new IllegalArgumentException(INPUT_STRING_NOT_NULL.message);
        }
    }

    public static void checkRoundNumber(String input) {
        if (!isRightRoundNumber(input)) {
            throw new IllegalArgumentException(INPUT_LADDER_NUMBER.message);
        }
    }

    private static boolean isRightRoundNumber(String input) {
        return Pattern.matches("^[1-9]\\d*$", input);
    }
}
