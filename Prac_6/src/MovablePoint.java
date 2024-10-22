public class MovablePoint implements Movable{
    private int x, y, xSpeed, ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        setY(y + ySpeed);
    }

    @Override
    public void moveDown() {
        setY(y - ySpeed);
    }

    @Override
    public void moveLeft() {
        setX(x - xSpeed);
    }

    @Override
    public void moveRight() {
        setX(x + xSpeed);
    }

    @Override
    public String toString() {
        return "Point coordinate: x = " + getX() + " y = " + getY() + "\n" +
        "Point speed: xSpeed = " + getxSpeed() + " ySpeed = " + getySpeed();
    }
}
