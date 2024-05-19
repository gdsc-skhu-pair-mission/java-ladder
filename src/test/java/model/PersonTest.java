package model;

import ladder.util.validator.PersonValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static ladder.view.ErrorMessageView.ErrorMessage;

class PersonTest {

    @Test
    @DisplayName("사람 이름 5글자 이상일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameOverRange() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkOverRange("5글자이상이름");
        });
        Assertions.assertEquals(ErrorMessage.INPUT_PERSON_NAME_IS_INCORRECT.getMessage(), exception.getMessage()); // 수정된 부분
    }

    @Test
    @DisplayName("사람 이름 공백일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameEmptyAndBlank() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkSpace(" ");
        });
        Assertions.assertEquals(ErrorMessage.INPUT_STRING_BLANK.getMessage(), exception.getMessage()); // 수정된 부분
    }

    @Test
    @DisplayName("사람 이름 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameNull() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkEmpty(null);
        });
        Assertions.assertEquals(ErrorMessage.INPUT_STRING_NOT_NULL.getMessage(), exception.getMessage()); // 수정된 부분
    }

    @Test
    @DisplayName("사람 이름 겹칠 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameDuplicate() {
        RuntimeException exception = Assertions.assertThrows(RuntimeException.class, () -> {
            PersonValidator.checkDuplicate("소정,소정");
        });
        Assertions.assertEquals(ErrorMessage.INPUT_STRING_DUPLICATE.getMessage(), exception.getMessage()); // 수정된 부분
    }
}
