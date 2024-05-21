package ladder.util.validator;

import java.util.regex.Pattern;
import ladder.util.validator.Exception.InputStringNullException;
import ladder.util.validator.Exception.LadderNumberIllegalException;

public class LadderValidator {

    public static void checkEmpty(String input) {
        if (input == null) {
            throw new InputStringNullException();
        }
    }

    public static void checkLadderNumberStandard(String input) {
        if (!isRightLadderNumber(input)) {
            throw new LadderNumberIllegalException();
        }
    }

    private static boolean isRightLadderNumber(String input) {
        return Pattern.matches("^[1-9]\\d*$", input);
    }
}
