package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public class PersonNameIllegalException extends CustomAbstractException {
    public PersonNameIllegalException() {
        super(ErrorMessage.INPUT_PERSON_NAME_IS_INCORRECT);
    }
}
