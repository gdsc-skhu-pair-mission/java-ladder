package model;

import static ladder.view.ErrorMessageView.ErrorMessage.INPUT_LADDER_NUMBER;
import static ladder.view.ErrorMessageView.ErrorMessage.INPUT_STRING_NOT_NULL;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import ladder.util.validator.LadderValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LadderTest {

    @Test
    @DisplayName("사다리 입력값이 null일 때 예외 처리를 검증")
    void should_ThrowException_When_LadderNumberIsNull() {
        assertThatThrownBy(() -> LadderValidator.checkEmpty(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(INPUT_STRING_NOT_NULL.getMessage());
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "-1", "1.1", "abc", ""})
    @DisplayName("사다리 입력 숫자가 기준에 부합하지 않을 때 예외 처리를 검증")
    void should_ThrowException_When_LadderNumberIsNotStandard(String input) {
        IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
            LadderValidator.checkLadderNumberStandard(input);
        });

        org.junit.jupiter.api.Assertions.assertEquals(INPUT_LADDER_NUMBER.getMessage(), exception.getMessage());
    }
}
