package model;

import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private static final int MINIMUM_PLAYER_COUNT = 2;

    private final List<Player> players;

    public Players(List<String> playerNames) {
        validatePlayerCount(playerNames);
        validateDuplicatePlayerName(playerNames);
        this.players = generatePlayers(playerNames);
    }

    public List<String> getPlayerNames() {
        return players.stream()
                .map(Player::getName)
                .collect(Collectors.toList());
    }

    public int getPlayerCount() {
        return players.size();
    }

    public void validatePlayerCount(List<String> playerNames) {
        if (playerNames.size() < MINIMUM_PLAYER_COUNT) {
            throw new IllegalArgumentException("플레이어는 2명 이상이어야 합니다.");
        }
    }

    public void validateDuplicatePlayerName(List<String> playerNames) {
        if (playerNames.size() != playerNames.stream().distinct().count()) {
            throw new IllegalArgumentException("중복된 이름이 존재합니다.");
        }
    }

    public List<Player> generatePlayers(List<String> playerNames) {
        return playerNames.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

}
