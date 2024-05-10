package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> readPlayerNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        try {
            String input = reader.readLine();
            String removedInput = removeBlank(input);
            return split(removedInput);
        } catch (IOException e) {
            throw new IllegalArgumentException("비정상적인 입력입니다. 다시 입력해주세요.");
        }
    }

    public static int readHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        try {
            String input = reader.readLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException | IOException e) {
            throw new IllegalArgumentException("높이는 숫자로 입력해주세요.");
        }
    }

    private static String removeBlank(String input) {
        return input.replaceAll(" ", "");
    }

    private static List<String> split(String input) {
        return Arrays.asList(input.split(","));
    }
}
