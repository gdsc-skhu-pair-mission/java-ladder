package util.validator;

import exception.LadderGameValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PlayerValidatorTest {

    @Test
    void playerNameValidator_정상_입력() {
        String[] playerNames = {"pobi", "honux", "crong", "jk"};
        assertDoesNotThrow(() -> PlayerValidator.validatePlayerNameIsCorrect(playerNames));
    }

    @Test
    void playerNameValidator_공백_포함() {
        String[] playerNames = {"pobi", "ho nux", "crong", "jk"};
        assertThrows(LadderGameValidationException.BlankPlayerNameException.class, () -> PlayerValidator.validatePlayerNameIsCorrect(playerNames));
    }

    @Test
    void playerNameValidator_공백() {
        String[] playerNames = {"pobi", "", "crong", "jk"};
        assertThrows(LadderGameValidationException.NotAllowEmptyInputException.class, () -> PlayerValidator.validatePlayerNameIsCorrect(playerNames));
    }

    @Test
    void playerNameValidator_이름_길이_초과() {
        String[] playerNames = {"pobi", "honux", "crong", "123456"};
        assertThrows(LadderGameValidationException.InvalidPlayerNameLengthException.class, () -> PlayerValidator.validatePlayerNameIsCorrect(playerNames));
    }

    @Test
    void playerNameValidator_중복_입력() {
        String[] playerNames = {"pobi", "pobi", "crong", "jk"};
        assertThrows(LadderGameValidationException.DuplicatedPlayerNameException.class, () -> PlayerValidator.validatePlayerNameIsCorrect(playerNames));
    }
}
