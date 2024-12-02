import javax.swing.*;
import java.awt.*;

public class GuessNumberGame extends JFrame {
    private final int secretNumber;
    private int tryLeft = 3;
    private final JTextField textField;
    private final JLabel resultLabel;

    public GuessNumberGame() {
        this.setTitle("Guess the number");
        this.setSize(1200, 800);
        this.setLayout(new BorderLayout());

        textField = new JTextField();
        this.add(textField, BorderLayout.CENTER);

        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(e -> checkGuess());
        this.add(guessButton, BorderLayout.SOUTH);

        resultLabel = new JLabel("");
        this.add(resultLabel, BorderLayout.EAST);

        secretNumber = (int) (Math.random() * 21);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void checkGuess() {
        try {
            int userGuess = Integer.parseInt(textField.getText());

            if (userGuess == secretNumber) {
                resultLabel.setText("Congratulations! You guessed the number.   ");
                textField.setEnabled(false);
            } else if (userGuess > 20 || userGuess < 0) {
                resultLabel.setText("Enter a number between 0 and 20");
            } else {
                tryLeft--;
                if (tryLeft > 0) {
                    if (userGuess > secretNumber)
                        resultLabel.setText("Incorrect. Attempts remaining: " + tryLeft + "   \n" + "Your guess > secret number   ");
                    else
                        resultLabel.setText("Incorrect. Attempts remaining: " + tryLeft + "   \n" + "Your guess < secret number   ");
                } else {
                    resultLabel.setText("You have exhausted all attempts. The number you are trying to guess is: " + secretNumber + "   ");
                    textField.setEnabled(false);
                }
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Enter a number between 0 and 20");
        }
    }
}