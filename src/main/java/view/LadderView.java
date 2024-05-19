package view;

public enum LadderView {

    BLANK("     "),
    FOOTHOLD("-----"),
    BAR("|");

    private final String symbol;

    LadderView(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
