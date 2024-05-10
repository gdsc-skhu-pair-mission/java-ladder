package model.ladder;

public enum Bridge {
    EMPTY, EXIST;

    public static Bridge of(boolean exist) {
        if (exist) {
            return EXIST;
        }
        return EMPTY;
    }
}
