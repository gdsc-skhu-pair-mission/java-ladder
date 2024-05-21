package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public class InputStringBlankException extends CustomAbstractException {
    public InputStringBlankException() {
        super(ErrorMessage.INPUT_STRING_BLANK);
    }
}
