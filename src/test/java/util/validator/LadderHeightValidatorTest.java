package util.validator;

import exception.LadderGameValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LadderHeightValidatorTest {

    @Test
    void ladderHeightValidator_정상_입력() {
        String ladderHeight = "5";
        assertDoesNotThrow(() -> LadderHeightValidator.validateLadderHeightNumberIsCorrect(ladderHeight));
    }

    @Test
    void ladderHeightValidator_정수가_아닌_입력() {
        String ladderHeight = "abc";
        assertThrows(LadderGameValidationException.NotNumericException.class,
                () -> LadderHeightValidator.validateLadderHeightNumberIsCorrect(ladderHeight));
    }

    @Test
    void ladderHeightValidator_음수_입력() {
        String ladderHeight = "-1";
        assertThrows(LadderGameValidationException.NotNaturalNumberException.class,
                () -> LadderHeightValidator.validateLadderHeightNumberIsCorrect(ladderHeight));
    }

    @Test
    void ladderHeightValidator_공백_입력() {
        String ladderHeight = "";
        assertThrows(LadderGameValidationException.NotAllowEmptyInputException.class,
                () -> LadderHeightValidator.validateLadderHeightNumberIsCorrect(ladderHeight));
    }
}
