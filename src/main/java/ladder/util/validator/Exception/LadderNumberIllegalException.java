package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public class LadderNumberIllegalException extends CustomAbstractException {
    public LadderNumberIllegalException() {
        super(ErrorMessage.INPUT_LADDER_NUMBER);
    }
}
