package chifoumi;

public enum Move {
    STONE,
    PAPER,
    SCISSOR;

    public boolean isGreaterThan(Move other) {
        throw new UnsupportedOperationException();
    }
}