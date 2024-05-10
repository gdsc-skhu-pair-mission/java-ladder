package model;

import static model.Bridge.EMPTY;
import static model.Bridge.EXIST;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RowTest {
    @Test
    @DisplayName("정상적으로 행 객체 생성")
    void should_CreateRowObjectSuccessfully() {
        // given
        RandomGenerateStrategy randomGenerateStrategy = new RandomGenerateStrategy();
        int countOfPlayer = 4;
        int expectedResult = countOfPlayer - 1;

        // when
        Row row = new Row(countOfPlayer, randomGenerateStrategy);
        List<Bridge> actualResult = row.getBridges();

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult.size());
    }

    @Test
    @DisplayName("정해진 다리 생성 전략에 따라 행 객체 생성")
    void should_CreateCorrectSizeRow() {
        // given
        FixedGenerateStrategy fixedGenerateStrategy = new FixedGenerateStrategy(List.of(true, false, true));
        List<Bridge> expectedResult = List.of(EXIST, EMPTY, EXIST);

        // when
        Row row = new Row(4, fixedGenerateStrategy);
        List<Bridge> actualResult = row.getBridges();

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
