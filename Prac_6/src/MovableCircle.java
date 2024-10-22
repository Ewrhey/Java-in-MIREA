public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center = new MovablePoint(0, 0, 0, 0);

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed){
        this.radius = radius;
        this.center.setX(x);
        this.center.setY(y);
        this.center.setxSpeed(xSpeed);
        this.center.setySpeed(ySpeed);
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setCenter(int x, int y, int xSpeed, int ySpeed){
        this.center.setX(x);
        this.center.setY(y);
        this.center.setxSpeed(xSpeed);
        this.center.setySpeed(ySpeed);
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public void moveUp() {
        center.setY(center.getY() + center.getySpeed());
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() - center.getySpeed());
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - center.getxSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + center.getxSpeed());
    }

    @Override
    public String toString() {
        return "Circle center coordinate: x = " + center.getX() + " y = " + center.getY() + "\n" +
                "Point speed: xSpeed = " + center.getxSpeed() + " ySpeed = " + center.getySpeed() +
                "\nRadius = " + getRadius() + "\nCircle borders:  x: [" +
                (center.getX() - getRadius()) + ", " + (center.getX() + getRadius()) + "] y: [" +
                (center.getY() - getRadius()) + ", " + (center.getY() + getRadius()) + "]";
    }
}
