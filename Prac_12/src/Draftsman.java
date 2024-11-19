import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Draftsman extends JFrame {
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    private ArrayList<Position> posTaken = new ArrayList<>();

    public Draftsman() {
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        int i = 0;
        while (i < 20) {
            createRandomShape();
            i++;
        }
    }


    private void createRandomShape() {
        Random random = new Random();

        int randX;
        int randY;
        int randSize;

        while (true) {
            randX = random.nextInt(WIDTH) + 1;
            randY = random.nextInt(HEIGHT) + 1;

            randSize = random.nextInt(100);

            if (randX + randSize > WIDTH) {
                randX -= randSize;
            }
            if (randX < 0) {
                randX = 0;
            }
            if (randY + randSize > HEIGHT) {
                randY -= randSize;
            }
            if (randY < 0) {
                randY = 0;
            }

            boolean test = checkCols(randX, randY, randSize);

            if (test) {
                posTaken.add(new Position(randX, randY, randSize));
                break;
            }
        }

        Position position = new Position(randX, randY, randSize);

        int randomShapeID = random.nextInt(2);

        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();

        Color randomColor = new Color(r, g, b);

        Shape shape;

        switch (randomShapeID) {
            case 0: {
                shape = new Rectangle(randomColor, new Position(randX, randY, randSize), this.getGraphics());
                break;
            }
            case 1: {
                shape = new Circle(randomColor, new Position(randX, randY, randSize), this.getGraphics());
                break;
            }
            default: {
                return;
            }
        }

        shape.draw();
    }

    public boolean valueInRange(int v, int min, int max) {
        return (v >= min) && (v <= max);
    }

    public boolean checkCols(int x, int y, int size) {
        for (Position in : posTaken) {
            boolean xOv = valueInRange(in.getX(), x, x + size) || valueInRange(x, in.getX(), in.getX() + in.getSize());
            boolean yOv = valueInRange(in.getY(), y, y + size) || valueInRange(y, in.getY(), in.getY() + in.getSize());

            if (xOv && yOv) {
                return false;
            }
        }

        return true;
    }
}