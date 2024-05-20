package model;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightTest {

    @Test
    @DisplayName("객체 생성 테스트")
    void heightObjectCreateTest() {

        String inputHeight = "5";

        Height height = new Height(inputHeight);

        assertEquals(inputHeight, height.getHeight());
    }
}
