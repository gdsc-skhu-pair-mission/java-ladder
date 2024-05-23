package view;

import domain.Message;

import java.util.Scanner;


public class InputView {
    private Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String[] inputNames() {
        System.out.println(printNamesMessage());
        String input = scanner.nextLine();
        return input.split(",");
    }
    public String printNamesMessage() {
        return Message.INPUT_HUMAN_NAME.toString();
    }

    public int inputHeight() {
        System.out.println(printHeight());
        return scanner.nextInt();
    }

    public String printHeight() {
        return Message.INPUT_LADDER_HEIGHT.toString();
    }

    public void closeScanner() {
        scanner.close();
    }
}
