import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MenuCountry extends JFrame implements ItemListener {
    static private JFrame frame;
    static private JLabel label1, label2;
    static private JPanel panel;
    static private JComboBox comboBox;
    public static void menu() {
        MenuCountry menuCountry = new MenuCountry();
        panel = new JPanel();
        frame = new JFrame("Frame");
        frame.setSize(1200, 900);
        label1 = new JLabel("Choice country ");
        label2 = new JLabel("");
        label1.setForeground(Color.red);
        label2.setForeground(Color.green);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        String[] titles = {"A", "B", "C"};
        comboBox = new JComboBox(titles);
        comboBox.addItemListener(menuCountry);
        panel.add(label1);
        panel.add(comboBox);
        panel.add(label2);
        frame.add(panel);

        frame.show();
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox) {
            if (comboBox.getSelectedItem() == "A")
                label2.setText(comboBox.getSelectedItem() + " is so boring");
            else
                label2.setText(comboBox.getSelectedItem() + " is so beautiful");
        }
    }
}
