package model;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    @DisplayName("정상적으로 참여자 객체 생성")
    void GetName() {
        Player player = new Player("pobix");

        assertEquals("pobix", player.getName());
    }
}
