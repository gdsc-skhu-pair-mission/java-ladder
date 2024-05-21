package model.players;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Players {
    private static final int MINIMUM_ALLOWED_LENGTH = 2;

    private final List<Player> players;

    public Players(List<String> playerNames) {
        checkPlayersLength(playerNames);
        checkPlayersIsNotDuplicate(playerNames);
        this.players = generatePlayers(playerNames);
    }

    public List<String> getPlayerNames() {
        return players.stream()
                .map(Player::getName)
                .toList();
    }

    public int countOfPlayers() {
        return players.size();
    }

    private void checkPlayersLength(List<String> playerNames) {
        if (playerNames.size() < MINIMUM_ALLOWED_LENGTH) {
            throw new IllegalArgumentException("플레이어는 최소 2명 이상이어야 합니다.");
        }
    }

    private void checkPlayersIsNotDuplicate(List<String> playerNames) {
        Set<String> uniqueNames = new HashSet<>();
        for (String name : playerNames) {
            if (!uniqueNames.add(name)) {
                throw new IllegalArgumentException("중복된 플레이어가 존재합니다: " + name);
            }
        }
    }

    private List<Player> generatePlayers(List<String> playerNames) {
        return playerNames.stream()
                .map(Player::new)
                .toList();
    }
}
