package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayersTest {
    @Test
    @DisplayName("정상적으로 참여자들 객체 생성")
    void should_CreatePlayersObjectSuccessfully() {
        // given
        List<String> expectedNames = List.of("pobi", "honux", "crong", "jk");

        // when
        Players players = new Players(expectedNames);

        // then
        assertThat(players).isNotNull();
        assertEquals(expectedNames, players.getPlayerNames());
    }

    @Test
    @DisplayName("참여자 수가 2명 미만일 시 예외 발생")
    void should_ThrowException_When_PlayerCountIsLessThanTwo() {
        // given
        List<String> names = List.of("pobi");

        // when & then
        assertThatThrownBy(() -> new Players(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 이름이 중복될 시 예외 발생")
    void should_ThrowException_When_PlayerNameIsDuplicate() {
        // given
        List<String> names = List.of("pobi", "pobi", "crong", "jk");

        // when & then
        assertThatThrownBy(() -> new Players(names))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("참여자 이름 반환 테스트")
    void should_ReturnPlayerNames() {
        // given
        List<String> expectedNames = List.of("pobi", "honux", "crong", "jk");
        Players players = new Players(expectedNames);

        // when
        List<String> actualNames = players.getPlayerNames();

        // then
        assertEquals(expectedNames, actualNames);
    }

    @Test
    @DisplayName("참여자 인원 수 반환 테스트")
    void should_ReturnPlayerCount() {
        // given
        List<String> expectedNames = List.of("pobi", "honux", "crong", "jk");
        int expectedCount = expectedNames.size();
        Players players = new Players(expectedNames);

        // when
        int actualCount = players.countOfPlayers();

        // then
        assertEquals(expectedCount, actualCount);
    }
}
