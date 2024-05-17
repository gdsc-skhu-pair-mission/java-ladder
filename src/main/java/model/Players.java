package model;

import java.util.List;

public class Players {

    private final List<Player> players;

    public Players(List<String> playerNames) {
        this.players = makePlayers(playerNames);
    }

    public int getPlayerCount() {
        return this.players.size();
    }

    public List<Player> getPlayers() {
        return players;
    }

    private List<Player> makePlayers(final List<String> playerNames) {
        return playerNames.stream()
                .map(Player::new)
                .toList();
    }
}
