package chifoumi;

public class AIPlayer extends Player {

    static final String AI_NAME = "Skynet";

    public AIPlayer() {
        super(AIPlayer.AI_NAME);
    }

    public Move play() {
        throw new UnsupportedOperationException();
    }
}