package model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayersTest {

    @Test
    @DisplayName("플레이어들이 생성되는지 확인합니다.")
    void createPlayersObject() {
        //given
        List<String> playerList = List.of("pobi", "crong", "honux", "jk");
        //when
        Players players = new Players(playerList);

        //then
        assertEquals(4, players.getPlayerNames().size());
    }

    @Test
    @DisplayName("플레이어들이 2명 이하이면 예외가 발생합니다.")
    void validatePlayerCount() {
        // given
        List<String> playerList = List.of("pobi");

        // when & then
        assertThatThrownBy(() -> new Players(playerList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어는 2명 이상이어야 합니다.");
    }

    @Test
    @DisplayName("중복된 이름이 있으면 예외가 발생합니다.")
    void validateDuplicatePlayerName() {
        // given
        List<String> playerList = List.of("pobi", "pobi");

        // when & then
        assertThatThrownBy(() -> new Players(playerList))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("중복된 이름이 존재합니다.");
    }

}
