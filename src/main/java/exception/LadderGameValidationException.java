package exception;

public class LadderGameValidationException {

    public static class DuplicatedPlayerNameException extends IllegalArgumentException {
        public DuplicatedPlayerNameException() {
            super(ErrorMessage.DUPLICATED_CAR_NAME.getMessage());
        }
    }

    public static class BlankPlayerNameException extends IllegalArgumentException {
        public BlankPlayerNameException() {
            super(ErrorMessage.NOT_ALLOW_BLANK.getMessage());
        }
    }

    public static class NotAllowEmptyInputException extends IllegalArgumentException {
        public NotAllowEmptyInputException() {
            super(ErrorMessage.NOT_ALLOW_EMPTY.getMessage());
        }
    }

    public static class InvalidPlayerNameLengthException extends IllegalArgumentException {
        public InvalidPlayerNameLengthException() {
            super(ErrorMessage.INVALID_NAME_LENGTH.getMessage());
        }
    }

    public static class NotNumericException extends IllegalArgumentException {
        public NotNumericException() {
            super(ErrorMessage.NOT_NUMERIC.getMessage());
        }
    }

    public static class NotNaturalNumberException extends IllegalArgumentException {
        public NotNaturalNumberException() {
            super(ErrorMessage.ONLY_NATURAL_NUMBER.getMessage());
        }
    }

    public static class NotAllowZeroNumberException extends IllegalArgumentException {
        public NotAllowZeroNumberException() {
            super(ErrorMessage.NOT_ALLOW_ZERO.getMessage());
        }
    }

}
