package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LadderTest {

    @Test
    @DisplayName("사다리 생성")
    public void 사다리_생성(){
        Ladder ladder = new Ladder(10);
        ladder.setHeight(10);
        assertEquals(10,ladder.getHeight());
    }
}
