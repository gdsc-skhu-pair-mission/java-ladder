package domain;

import domain.exception.HumanNameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HumanTest {

    @Test
    @DisplayName("이름이 5글자를 초과할 경우 HumanNameException 예외 발생")
    void throwHumanNameException() {
        // given
        String longName = "가나다라마바";

        // when & then
        assertThatThrownBy(() -> new Human(longName))
                .isInstanceOf(HumanNameException.class)
                .hasMessage("사람 이름은 5글자 이내로 작성해주세요.");
    }

}
