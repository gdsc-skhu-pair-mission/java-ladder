package model;

import ladder.util.validator.Exception.InputStringNullException;
import ladder.util.validator.Exception.LadderNumberIllegalException;
import ladder.util.validator.LadderValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LadderTest {

    @Test
    @DisplayName("사다리 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsLadderNumberNull() {
        InputStringNullException exception = Assertions.assertThrows(InputStringNullException.class, () -> {
            LadderValidator.checkEmpty(null);
        });
        Assertions.assertEquals("null이 될 수 없습니다.", exception.getErrorMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "1.1", "abc", ""})
    @DisplayName("입력된 숫자가 조건에 맞지 않는 예외 처리 테스트")
    void should_ThrowException_When_IsLadderNumberStandard(String input) {
        LadderNumberIllegalException exception = Assertions.assertThrows(LadderNumberIllegalException.class, () -> {
            LadderValidator.checkLadderNumberStandard(input);
        });
        Assertions.assertEquals("입력된 숫자가 조건에 맞지 않습니다.", exception.getErrorMessage());
    }
}

