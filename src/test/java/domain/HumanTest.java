package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HumanTest {
    @Test
    @DisplayName("사람 이름은 5글자까지 부여하면 생성된다.")
    void createName(){
        String validName = "pobiaa";
        assertThatThrownBy(()-> new Human("pobiaa"))
                .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("이름의 길이는 5글자 이하여야 합니다.");
    }

}
