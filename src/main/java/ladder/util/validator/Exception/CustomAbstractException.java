package ladder.util.validator.Exception;

import ladder.util.ErrorMessage;

public abstract class CustomAbstractException extends RuntimeException {

    private final ErrorMessage errorMessage;

    protected CustomAbstractException(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage.message;
    }
}
