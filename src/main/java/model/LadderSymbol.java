package model;


public enum LadderSymbol {

    BLANK("     "),
    FOOTHOLD("-----"),
    BAR("|");

    private final String symbol;

    LadderSymbol(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}