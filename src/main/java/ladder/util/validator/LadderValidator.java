package ladder.util.validator;

import ladder.util.ErrorMessage;

import java.util.regex.Pattern;

public class LadderValidator {

    public static void checkEmpty(String input) {
        if (input == null) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_STRING_NOT_NULL.message);
        }
    }

    public static void checkLadderNumberStandard(String input) {
        if (!isRightLadderNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_LADDER_NUMBER.message);
        }
    }

    private static boolean isRightLadderNumber(String input) {
        return Pattern.matches("^[1-9]\\d*$", input);
    }
}
