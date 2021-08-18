package JPaneOption;
import javax.swing.JOptionPane;
public class Testing {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
// create the message
        String message =
                String.format("Welcome, %s, to Java Programming!", name);
// display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
}
