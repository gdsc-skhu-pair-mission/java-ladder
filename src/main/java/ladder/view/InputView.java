package ladder.view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String inputNames() {
        return scanner.nextLine();
    }

    public String inputLadderHeight() {
        return scanner.nextLine();
    }
}
