package model.ladder.strategy;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerateStrategy implements GenerateStrategy {
    private static final int BRIDGE_UNCONNECTED = 0;
    private static final int MINIMUM_PLAYER_COUNT = 2;

    @Override
    public List<Boolean> generate(int countOfPlayer) {
        validatePlayerCount(countOfPlayer);
        return createBridges(countOfPlayer - 1);
    }

    private void validatePlayerCount(int countOfPlayer) {
        if (countOfPlayer < MINIMUM_PLAYER_COUNT) {
            throw new IllegalArgumentException("플레이어는 최소 2명 이상이어야 합니다.");
        }
    }

    private List<Boolean> createBridges(int countOfBridge) {
        List<Boolean> bridges = new ArrayList<>();
        for (int i = 0; i < countOfBridge; i++) {
            bridges.add(decideBridgeConnection(bridges, i));
        }
        return bridges;
    }

    private boolean decideBridgeConnection(List<Boolean> bridges, int currentIndex) {
        if (wasPreviousBridgeConnected(bridges, currentIndex)) {
            return false;
        }
        return decideBridgeConnection();
    }

    private static boolean wasPreviousBridgeConnected(List<Boolean> bridges, int currentIndex) {
        if (currentIndex == 0) {
            return false;
        }
        return bridges.get(currentIndex - 1);
    }

    private boolean decideBridgeConnection() {
        return (int) (Math.random() * 2) != BRIDGE_UNCONNECTED;
    }
}
