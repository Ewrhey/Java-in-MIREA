import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class Main {
    public static void pictureOut(String[] way){
        try {
            if (way.length > 0) {
                BufferedImage image = ImageIO.read(new File(way[0]));
                JFrame frame = new JFrame("TestPicture");
                frame.setSize(1900, 1000);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel = new JPanel();
                JLabel label = new JLabel((new ImageIcon(image)));
                panel.add(label);
                frame.add(panel);
                frame.setVisible(true);
            }
            else
                System.out.println("Need a file name");

        } catch (IOException e) {
            System.out.println("Problem in operation:\n");
        }

    }

    public static void main(String[] args) {
        //new Match();
        //pictureOut(args);
    }
}
