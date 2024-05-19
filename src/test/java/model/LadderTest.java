package model;

import static ladder.util.ErrorMessage.INPUT_LADDER_NUMBER;
import static ladder.util.ErrorMessage.INPUT_STRING_NOT_NULL;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import ladder.util.validator.LadderValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LadderTest {



    @Test
    @DisplayName("사다리 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsLadderNumberNull() {
        assertThatThrownBy(() -> LadderValidator.checkEmpty(null))
                .isInstanceOf(RuntimeException.class)
                .hasMessage(INPUT_STRING_NOT_NULL.message);
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

