import controller.LadderController;
import domain.Ladder;
import view.InputView;
import view.OutputView;

public class Application {
    public static LadderController ladderController = new LadderController(new OutputView(), new InputView(), new Ladder(0));

    public static void main(String[] args) {
        ladderController.gameStart();
    }
}