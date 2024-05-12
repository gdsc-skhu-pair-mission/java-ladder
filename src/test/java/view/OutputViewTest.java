package view;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp(){
        System.setOut(new PrintStream(outContent));
    }
    @AfterEach
    void tearDown(){
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("사람 이름 출력")
    void printPersonName(){
        // given
        OutputView outputView = new OutputView();
        List<String> names = Arrays.asList("pobi", "honux", "crong", "jk");

        // when
        outputView.printNames(names);

        // then
        assertEquals("pobi honux crong jk " , outContent.toString());
    }

}
