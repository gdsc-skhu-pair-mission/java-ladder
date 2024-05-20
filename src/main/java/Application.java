import controller.LadderGameController;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        LadderGameController ladderGameController = new LadderGameController();
        ladderGameController.run();
    }
}
