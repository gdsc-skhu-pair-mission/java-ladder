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
    @DisplayName("행 생성이 올바르게 되는지 확인1")
    void should_CreateCorrectSizeRow1() {
        // given
        FixedGenerateStrategy fixedGenerateStrategy = new FixedGenerateStrategy(List.of(true, false, true));
        Row row = new Row(4, fixedGenerateStrategy);
        List<Bridge> expectedResult = List.of(EXIST, EMPTY, EXIST);

        // when
        List<Bridge> actualResult = row.getBridges();

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("행 생성이 올바르게 되는지 확인2")
    void should_CreateCorrectSizeRow2() {
        // given
        FixedGenerateStrategy fixedGenerateStrategy = new FixedGenerateStrategy(List.of(false, true, false));
        Row row = new Row(4, fixedGenerateStrategy);
        List<Bridge> expectedResult = List.of(EMPTY, EXIST, EMPTY);

        // when
        List<Bridge> actualResult = row.getBridges();

        // then
        assertNotNull(actualResult);
        assertEquals(expectedResult, actualResult);
    }
}
