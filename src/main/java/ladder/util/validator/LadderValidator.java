package ladder.util.validator;

import ladder.view.ErrorMessageView;

import java.util.regex.Pattern;

public class LadderValidator {

    public static void checkEmpty(String input) {
        if (input == null) {
            ErrorMessageView.printErrorMessage(ErrorMessageView.ErrorMessage.INPUT_STRING_NOT_NULL);
            throw new IllegalArgumentException(ErrorMessageView.ErrorMessage.INPUT_STRING_NOT_NULL.getMessage());
        }
    }

    public static void checkLadderNumberStandard(String input) {
        if (!isRightLadderNumber(input)) {
            ErrorMessageView.printErrorMessage(ErrorMessageView.ErrorMessage.INPUT_LADDER_NUMBER);
            throw new IllegalArgumentException(ErrorMessageView.ErrorMessage.INPUT_LADDER_NUMBER.getMessage());
        }
    }

    private static boolean isRightLadderNumber(String input) {
        return Pattern.matches("^[1-9]\\d*$", input);
    }
}
