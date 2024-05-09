package ladder;

import domain.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    private Player player;

    @BeforeEach
    void 플레이어_초기화() {
        String playerName = "p1";
        player = new Player(playerName);
    }

    @Test
    void 플레이어_생성_테스트() {
        String expectedName = player.getPlayerName();
        assertThat(expectedName).isEqualTo("p1");
    }
}