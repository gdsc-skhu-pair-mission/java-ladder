package util.validator;

import exception.LadderGameValidationException;

public class LadderHeightValidator {

    public static void validateLadderHeightNumberIsCorrect(String ladderNumber) {
        validateLadderHeightNumberIsEmpty(ladderNumber);
        validateLadderHeightNumberIsNotInt(ladderNumber);
        validateLadderHeightNumberIsNaturalNumber(ladderNumber);
    }

    private static void validateLadderHeightNumberIsNotInt(String ladderNumber) {
        try {
            Integer.parseInt(ladderNumber);
        } catch (NumberFormatException e) {
            throw new LadderGameValidationException.NotNumericException();
        }
    }

    private static void validateLadderHeightNumberIsNaturalNumber(String ladderNumber) {
        int number = Integer.parseInt(ladderNumber);
        if (number <= 0) {
            throw new LadderGameValidationException.NotNaturalNumberException();
        }
    }

    private static void validateLadderHeightNumberIsEmpty(String ladderNumber) {
        if (ladderNumber.isEmpty()) {
            throw new LadderGameValidationException.NotAllowEmptyInputException();
        }
    }
}
