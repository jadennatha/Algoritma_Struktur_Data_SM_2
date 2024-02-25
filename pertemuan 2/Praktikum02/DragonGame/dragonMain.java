package DragonGame;

public class dragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.changeDirection(4);
        dragon1.move(3);
        dragon1.printStatus();
    }
}
