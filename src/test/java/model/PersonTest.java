package model;

import static ladder.util.ErrorMessage.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ladder.util.validator.PersonValidator;

class PersonTest {

    @Test
    @DisplayName("사람 이름 5글자 이상일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameOverRange() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkOverRange("5글자이상이름");
        });
        Assertions.assertEquals(INPUT_PERSON_NAME_IS_INCORRECT.message, exception.getMessage());
    }

    @Test
    @DisplayName("사람 이름 공백일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameEmptyAndBlank() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkSpace(" ");
        });
        Assertions.assertEquals(INPUT_STRING_BLANK.message, exception.getMessage());
    }

    @Test
    @DisplayName("사람 이름 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameNull() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkEmpty(null);
        });
        Assertions.assertEquals(INPUT_STRING_NOT_NULL.message, exception.getMessage());
    }

    @Test
    @DisplayName("사람 이름 겹칠 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameDuplicate() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkDuplicate("소정,소정");
        });
        Assertions.assertEquals(INPUT_STRING_DUPLICATE.message, exception.getMessage());
    }


}
