package view;

import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public String[] inputName() {
        String input = scanner.nextLine();
        String []names = input.split(",");
        return names;

    }
    public int inputHeight() {
        int height = scanner.nextInt();
        scanner.close();
        return height;
    }
}
