package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ladder.util.validator.LadderValidator;

import static ladder.util.ErrorMessage.INPUT_LADDER_NUMBER;
import static ladder.util.ErrorMessage.INPUT_STRING_NOT_NULL;

public class LadderTest {

    @Test
    @DisplayName("사다리 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsLadderNumberNull() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            LadderValidator.checkEmpty(null);
        });
        Assertions.assertEquals(INPUT_STRING_NOT_NULL.message, exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "1.1", "abc", ""})
    @DisplayName("입력된 숫자가 조건에 맞지 않는 예외 처리 테스트")
    void should_ThrowException_When_IsLadderNumberStandard(String input) {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            LadderValidator.checkLadderNumberStandard(input);
        });
        Assertions.assertEquals(INPUT_LADDER_NUMBER.message, exception.getMessage());
    }
}

