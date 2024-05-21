package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public class NameDuplicateException extends CustomAbstractException {
    public NameDuplicateException() {
        super(ErrorMessage.INPUT_STRING_DUPLICATE);
    }
}
