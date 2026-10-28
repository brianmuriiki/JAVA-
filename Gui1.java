import java.awt.*;
import javax.swing.*;

public class Gui1 extends JFrame {


private JTextField nameField;
private JTextField courseField;
private JTextField yearField;

public Gui1() {
    setTitle("Student Registration");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
    panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

    JLabel nameLabel = new JLabel("Student Name:");
    nameField = new JTextField();

    JLabel courseLabel = new JLabel("Course:");
    courseField = new JTextField();

    JLabel yearLabel = new JLabel("Year of Study:");
    yearField = new JTextField();

    JButton submitButton = new JButton("Submit");

    panel.add(nameLabel);
    panel.add(nameField);

    panel.add(courseLabel);
    panel.add(courseField);

    panel.add(yearLabel);
    panel.add(yearField);

    panel.add(new JLabel(""));
    panel.add(submitButton);

    submitButton.addActionListener(e -> {
        String name = nameField.getText().trim();
        String course = courseField.getText().trim();
        String year = yearField.getText().trim();

        if (name.isEmpty() || course.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(
                this,
                "Please fill in all fields."
            );
            return;
        }

        JOptionPane.showMessageDialog(
            this,
            "Registration Successful!\n\n" +
            "Name: " + name + "\n" +
            "Course: " + course + "\n" +
            "Year: " + year
        );
    });

    add(panel);
}

public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        new Gui1().setVisible(true);
    });
}


}
