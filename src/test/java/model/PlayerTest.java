package model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    @DisplayName("플레이어가 생성되는지 확인합니다.")
    void createPlayerObject() {
        // given
        String name = "pobi";

        // when
        Player player = new Player(name);

        // then
        assertEquals("pobi", player.getName());
    }

    @Test
    @DisplayName("플레이어의 이름이 5글자를 초과하면 예외가 발생합니다.")
    void validateNameLength() {
        // given
        String name = "pobibibibi";

        // when & then
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
