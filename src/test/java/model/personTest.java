package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class personTest {

    @Test
    @DisplayName("사람 이름 5글자 이상일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameOverRange() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkOverRange("5글자이상이름");
        });
        Assertions.assertEquals(INPUT_PERSON_NAME_IS_INCORRECT.message, exception.getMessage());
    }
}
