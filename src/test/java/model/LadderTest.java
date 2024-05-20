package model;

import static model.ladder.Bridge.EMPTY;
import static model.ladder.Bridge.EXIST;

import java.util.List;
import model.ladder.Ladder;
import model.ladder.strategy.GenerateStrategy;
import model.ladder.strategy.RandomGenerateStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class LadderTest {
    @Test
    @DisplayName("정상적으로 사다리 생성되는지 확인")
    void should_InitializeLadderSuccessfully() {
        // given
        GenerateStrategy generateStrategy = new FixedGenerateStrategy(List.of(true, false, true));
        int countOfPlayer = 3;
        int countOfHeight = 3;
        List<List<Boolean>> exceptedResult = List.of(List.of(true, false, true), List.of(true, false, true),
                List.of(true, false, true));

        // when
        Ladder ladder = new Ladder(generateStrategy);
        ladder.init(countOfPlayer, countOfHeight);

        // then
        assertNotNull(ladder);
        assertEquals(exceptedResult, ladder.getLadder());
    }
}
