package DragonGame;

public class Dragon {
    int x;
    int y;
    int direction;

    public void changeDirection(int newDirection){
        direction = newDirection;
        if (direction > 4){
            direction = 4;
        }
    }

    public void move(int steps){
        if (direction == 1){
            y += steps;
        } else if (direction == 2){
            x += steps;
        } else if (direction == 3){
            y -= steps;
        } else if (direction == 4){
            x -= steps;
        }
    }

    public void printStatus(){
        System.out.println(x);
        System.out.println(y);

    }
}
