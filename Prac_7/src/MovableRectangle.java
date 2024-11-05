public class MovableRectangle implements Movable{
    private MovablePoint upLeft;
    private MovablePoint downRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2) {
        upLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        downRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }
    
    @Override
    public void moveUp() {
        upLeft.moveUp();
        downRight.moveUp();
    }

    @Override
    public void moveDown() {
        upLeft.moveDown();
        downRight.moveDown();
    }

    @Override
    public void moveLeft() {
        upLeft.moveLeft();
        downRight.moveLeft();
    }

    @Override
    public void moveRight() {
        upLeft.moveRight();
        downRight.moveRight();
    }

    public Boolean checkSameSpeed() {
        if (upLeft.getxSpeed() == downRight.getxSpeed() && upLeft.getySpeed() == downRight.getySpeed()) {
            System.out.println("\nPoints speed compare");
            return true;
        }
        else {
            System.out.println("\nPoints speed isn't equal");
            return false;
        }
    }

    @Override
    public String toString() {
        return "UpLeft Point:\nPoint coordinate: x = " + upLeft.getX() + " y = " + upLeft.getY() +
                "\nPoint speed: xSpeed = " + upLeft.getxSpeed() + " ySpeed = " + upLeft.getySpeed()
                + "\nDownRight Point:\nPoint coordinate: x = " + downRight.getX() + " y = " + downRight.getY() +
                "\nPoint speed: xSpeed = " + downRight.getxSpeed() + " ySpeed = " + downRight.getySpeed();
    }
    
}