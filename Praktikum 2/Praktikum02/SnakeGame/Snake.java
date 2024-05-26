package SnakeGame;

public class Snake {
    int x;
    int y;

    public void moveLeft(){
        x -= 1;
        y += 0;
    }

    public void moveRight(){
        x += 1;
        y += 0;
    }

    public void moveUp(){
        x += 0;
        y += 1;
    }

    public void moveDown(){
        x += 0;
        y -= 1;
    }
     
    public void printPosistion(){
        System.out.println(x);
        System.out.println(y);

    }
}
