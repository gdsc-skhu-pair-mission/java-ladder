package model;

import ladder.util.validator.Exception.InputStringBlankException;
import ladder.util.validator.Exception.InputStringNullException;
import ladder.util.validator.Exception.NameDuplicateException;
import ladder.util.validator.Exception.PersonNameIllegalException;
import ladder.util.validator.PersonValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    @DisplayName("사람 이름 5글자 이상일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameOverRange() {
        PersonNameIllegalException exception = Assertions.assertThrows(PersonNameIllegalException.class, () -> {
            PersonValidator.checkOverRange("5글자이상이름");
        });
        Assertions.assertEquals("입력한 사람 이름이 올바르지 않습니다.", exception.getErrorMessage());
    }

    @Test
    @DisplayName("사람 이름 공백일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameEmptyAndBlank() {
        InputStringBlankException exception = Assertions.assertThrows(InputStringBlankException.class, () -> {
            PersonValidator.checkSpace(" ");
        });
        Assertions.assertEquals("입력 값은 공백이 될 수 없습니다.", exception.getErrorMessage());
    }

    @Test
    @DisplayName("사람 이름 null일 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameNull() {
        InputStringNullException exception = Assertions.assertThrows(InputStringNullException.class, () -> {
            PersonValidator.checkEmpty(null);
        });
        Assertions.assertEquals("null이 될 수 없습니다.", exception.getErrorMessage());
    }

    @Test
    @DisplayName("사람 이름 겹칠 때 예외 처리 테스트")
    void should_ThrowException_When_IsPersonNameDuplicate() {
        NameDuplicateException exception = Assertions.assertThrows(NameDuplicateException.class, () -> {
            PersonValidator.checkDuplicate("소정,소정");
        });
        Assertions.assertEquals("입력 값이 중복되었습니다.", exception.getErrorMessage());
    }
}
