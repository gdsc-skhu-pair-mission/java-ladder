package view;

import util.validator.LadderHeightValidator;
import util.validator.PlayerValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String[] readPlayerNames() throws IOException {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String input = reader.readLine();

        String[] playerNames = convertInputStringToArray(input);
        PlayerValidator.validatePlayerNameIsCorrect(playerNames);

        return playerNames;
    }

    public String readLadderHeightNumber() throws IOException {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String ladderHeightNumber = reader.readLine();

        LadderHeightValidator.validateLadderHeightNumberIsCorrect(ladderHeightNumber);

        return ladderHeightNumber;
    }

    private String[] convertInputStringToArray(String input) {
        return input.split(",");
    }

}