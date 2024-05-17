package util.validator;

import exception.LadderGameValidationException;

import java.util.HashSet;
import java.util.Set;

public class PlayerValidator {

    public static void validatePlayerNameIsCorrect(String[] playerNames) {
        validatePlayerNameHasNoSpace(playerNames);
        validatePlayerNameIsNotEmpty(playerNames);
        validatePlayerNameLength(playerNames);
        validatePlayerNameDuplicated(playerNames);
    }

    private static void validatePlayerNameDuplicated(String[] playerNames) {
        Set<String> carNameSet = new HashSet<>();
        for (String name : playerNames) {
            if (!carNameSet.add(name)) {
                throw new LadderGameValidationException.DuplicatedPlayerNameException();
            }
        }
    }

    private static void validatePlayerNameIsNotEmpty(String[] playerNames) {
        for (String name : playerNames) {
            if (name.isEmpty()) {
                throw new LadderGameValidationException.NotAllowEmptyInputException();
            }
        }
    }

    private static void validatePlayerNameHasNoSpace(String[] playerNames) {
        for (String name : playerNames) {
            if (name.contains(" ")) {
                throw new LadderGameValidationException.BlankPlayerNameException();
            }
        }
    }

    private static void validatePlayerNameLength(String[] playNames) {
        final int LENGTH_LIMIT_NUMBER = 5;

        for (String name : playNames) {
            if (name.length() > LENGTH_LIMIT_NUMBER) {
                throw new LadderGameValidationException.InvalidPlayerNameLengthException();
            }
        }
    }
}
