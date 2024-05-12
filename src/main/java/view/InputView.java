package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class InputView {
    private static final String HEIGHT_INPUT_REGEX = "[0-9]+";

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static List<String> getPlayerNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        try {
            String input = reader.readLine();
            return List.of(input.split(","));
        } catch (IOException e) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    private static boolean isNotValidLadderHeight(String input) {
        return !input.matches(HEIGHT_INPUT_REGEX);
    }

    private static boolean isNotValidLadderHeightRange(int height) {
        return height < 1;
    }

    public static int getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        try {
            String input = reader.readLine();

            if (isNotValidLadderHeight(input)) {
                throw new IllegalArgumentException("사다리 높이는 숫자여야 합니다.");
            }
            if (isNotValidLadderHeightRange(Integer.parseInt(input))) {
                throw new IllegalArgumentException("사다리 높이는 1 이상이어야 합니다.");
            }

            return Integer.parseInt(input);
        } catch (IOException e) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

}
