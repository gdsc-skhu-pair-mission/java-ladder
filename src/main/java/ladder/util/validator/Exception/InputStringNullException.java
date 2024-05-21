package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public class InputStringNullException extends CustomAbstractException {
    public InputStringNullException() {
        super(ErrorMessage.INPUT_STRING_NOT_NULL);
    }
}
