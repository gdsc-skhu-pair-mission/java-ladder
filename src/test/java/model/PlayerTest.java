package model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import model.players.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {
    @Test
    @DisplayName("정상적으로 참여자 객체 생성")
    void should_CreatePlayerObjectSuccessfully() {
        // given
        String name = "pobi";

        // when
        Player player = new Player(name);

        // then
        assertThat(player).isNotNull();
    }

    @Test
    @DisplayName("참여자 이름이 최대 허용 길이 초과 시 예외 발생")
    void should_ThrowException_When_MethodNameExceedsMaximumAllowedLength() {
        // given
        String name = "spiderman";

        // when & then
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 이름에 숫자 포함 시 예외 발생")
    void should_ThrowException_When_MethodNameIncludeNumber() {
        // given
        String name = "pobi2";

        // when & then
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 이름에 특수문자 포함 시 예외 발생")
    void should_ThrowException_When_MethodNameIncludeSpecialCharacters() {
        // given
        String name = "pobi@";

        // when & then
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 이름에 한글 포함 시 예외 발생")
    void should_ThrowException_When_MethodNameIncludeKorean() {
        // given
        String name = "포비";

        // when & then
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
