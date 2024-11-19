import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MiniCalculator extends JFrame implements ItemListener{
    static private JFrame frame;
    static private JPanel panel;
    static private JComboBox comboBox;

    public static void calculatorGen() {
        JTextField jta1 = new JTextField(10);
        JTextField jta2 = new JTextField(10);
        JButton button = new JButton(" Calculate");
        Font fnt = new Font("Times new roman", Font.BOLD, 20);
        MiniCalculator miniCalculator = new MiniCalculator();

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(250, 150);
        String[] strings = {"+", "-", "*", "/"};
        comboBox = new JComboBox(strings);
        comboBox.addItemListener(miniCalculator);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    switch (comboBox.getSelectedItem().toString()){
                        case "+":
                            JOptionPane.showMessageDialog(null,
                                    "Result =  " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "-":
                            JOptionPane.showMessageDialog(null,
                                    "Result =  " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "*":
                            JOptionPane.showMessageDialog(null,
                                    "Result =  " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "/":
                            JOptionPane.showMessageDialog(null,
                                    "Result =  " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case null:
                            break;
                        default:
                            JOptionPane.showMessageDialog(
                                    null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(
                            null, "Error in Numbers!", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });






        frame.add(new JLabel("1st Number"));
        frame.add(jta1);
        frame.add(new JLabel("2nd Number"));
        frame.add(jta2);
        frame.add(button);
        frame.add(comboBox);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
