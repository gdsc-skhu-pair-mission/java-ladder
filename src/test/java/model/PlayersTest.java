package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayersTest {
    @Test
    @DisplayName("리스트를 사용해 정상적으로 Players 객체를 생성하고, 값이 같은지 확인")
    void Players_Object_Create_Success_Test() {
        // given
        List<String> playerNames = new ArrayList<>();

        playerNames.add("Player1");
        playerNames.add("Player2");
        playerNames.add("Player3");

        // when
        Players players = new Players(playerNames);

        // then
        assertThat(players.getPlayers()).hasSize(playerNames.size());

        List<String> extractedNames = players.getPlayers().stream()
                .map(Player::getName)
                .toList();

        assertThat(extractedNames).containsExactlyElementsOf(playerNames);
    }
}
