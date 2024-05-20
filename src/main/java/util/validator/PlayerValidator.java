package util.validator;

import exception.LadderGameValidationException;

import java.util.Arrays;
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
        Set<String> playerNameSet = new HashSet<>();
        if (Arrays.stream(playerNames).anyMatch(name -> !playerNameSet.add(name))) {
            throw new LadderGameValidationException.DuplicatedPlayerNameException();
        }
    }

    private static void validatePlayerNameIsNotEmpty(String[] playerNames) {
        if (Arrays.stream(playerNames).anyMatch(String::isEmpty)) {
            throw new LadderGameValidationException.NotAllowEmptyInputException();
        }
    }

    private static void validatePlayerNameHasNoSpace(String[] playerNames) {
        if (Arrays.stream(playerNames).anyMatch(name -> name.contains(" "))) {
            throw new LadderGameValidationException.BlankPlayerNameException();
        }
    }

    private static void validatePlayerNameLength(String[] playNames) {
        final int LENGTH_LIMIT_NUMBER = 5;
        if (Arrays.stream(playNames).anyMatch(name -> name.length() > LENGTH_LIMIT_NUMBER)) {
            throw new LadderGameValidationException.InvalidPlayerNameLengthException();
        }
    }
}
