package view;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputViewTest {


    @Test
    public void inputNames() {

        // given
        InputView inputView = new InputView();
        String input = "pobi,crong,honux,jk";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // when
        String[] result = inputView.inputNames();

        //then
        assertArrayEquals(new String []{"pobi,crong,honux,jk"}, result);
    }
}
