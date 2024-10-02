package chifoumi;

public abstract class Player implements IPlayer {

    private String name;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}