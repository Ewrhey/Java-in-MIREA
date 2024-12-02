import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class FontChange extends JFrame {
    public FontChange() {

        this.setSize(1200, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        String[] colorsString = {"Black", "Green", "Red"};
        Color[] colorsColor = {Color.BLACK, Color.GREEN, Color.RED};
        JComboBox<String> colorsBox = new JComboBox<String>(colorsString);
        colorsBox.setSize(300, 50);
        this.add(colorsBox, BorderLayout.EAST);

        String[] fontsString = {"TimesNewRoman", "Broadway", "Courier New"};
        Font[] fontsFont = {
                new Font("TimesNewRoman", Font.PLAIN, 20),
                new Font("Broadway", Font.PLAIN, 20),
                new Font("Courier New", Font.PLAIN, 20)
        };
        JComboBox<String> fontsBox = new JComboBox<String>(fontsString);
        fontsBox.setSize(300, 50);
        this.add(fontsBox, BorderLayout.WEST);

        JTextArea textArea = new JTextArea("", 10, 20);
        textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
        textArea.setLayout(new BorderLayout());
        this.add(textArea, BorderLayout.SOUTH);


        colorsBox.addActionListener(e -> textArea.setForeground(colorsColor[Arrays.asList(colorsString).indexOf(colorsBox.getSelectedItem().toString())]));
        fontsBox.addActionListener(e -> textArea.setFont(fontsFont[Arrays.asList(fontsString).indexOf(fontsBox.getSelectedItem().toString())]));
        setVisible(true);

    }

}