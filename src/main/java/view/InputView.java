package view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String[] inputNames() {
        String input = scanner.nextLine();
        return input.split(",");
    }

    public int inputHeight() {
        return scanner.nextInt();
    }

    public void closeScanner() {
        scanner.close();
    }
}
