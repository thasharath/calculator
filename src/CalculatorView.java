import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.Border;


public class CalculatorView extends JFrame {

    private final JTextField numOne = new JTextField(8);
    private final JTextField numTwo = new JTextField(8);
    private final JButton addButton = new JButton("+");
    private final JButton subButton = new JButton("-");
    private final JButton mulButton = new JButton("x");
    private final JButton divButton = new JButton("/");
    private final JButton percentButton = new JButton("%");
    private final JButton acButton = new JButton("AC");
    private final JTextField solution = new JTextField(16);

    public CalculatorView() {

        JPanel panelNumbers = new JPanel();
        JPanel panelButtons = new JPanel();
        JPanel panelSolution = new JPanel();

        // Setting the properties for the button, textbox components
        setComponentProperties(numOne, new Font("Fira Code", Font.PLAIN, 22), new RoundedBorder(7), Color.WHITE,
                SwingConstants.RIGHT);
        setComponentProperties(numTwo, new Font("Fira Code", Font.PLAIN, 22), new RoundedBorder(7), Color.WHITE,
                SwingConstants.RIGHT);
        setComponentProperties(solution, new Font("Fira Code", Font.PLAIN, 24), new RoundedBorder(7), Color.WHITE,
                SwingConstants.RIGHT);
        setComponentProperties(addButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));
        setComponentProperties(subButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));
        setComponentProperties(mulButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));
        setComponentProperties(divButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));
        setComponentProperties(percentButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));
        setComponentProperties(acButton, new Font("Fira Code", Font.BOLD, 22), new RoundedBorder(7), new Color(0xf59806));


        // Adding the components to the panels
        panelNumbers.add(numOne);
        panelNumbers.add(numTwo);

        panelButtons.add(addButton);
        panelButtons.add(subButton);
        panelButtons.add(mulButton);
        panelButtons.add(divButton);
        panelButtons.add(percentButton);

        panelSolution.add(solution);
        panelSolution.add(acButton);

        // Frame settings
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3, 1));
        this.add(panelNumbers);
        this.add(panelButtons);
        this.add(panelSolution);
    }


    public float getNumOne() {
        return Float.parseFloat(numOne.getText());
    }

    public float getNumTwo() {
        return Float.parseFloat(numTwo.getText());
    }

    public void setSolution(String s) {
        solution.setText(s);
    }


    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSubButton() {
        return subButton;
    }

    public JButton getMulButton() {
        return mulButton;
    }

    public JButton getDivButton() {
        return divButton;
    }

    public JButton getPercentButton() {
        return percentButton;
    }

    // Adding the action listener for the buttons
    void listener(ActionListener listen) {
        addButton.addActionListener(listen);
        subButton.addActionListener(listen);
        mulButton.addActionListener(listen);
        divButton.addActionListener(listen);
        percentButton.addActionListener(listen);
    }

    // Action listener for clear button
    public void acListener(ActionListener listen) {
        acButton.addActionListener(listen);
    }

    // method to clear all text fields
    public void allClear() {
        numOne.setText("");
        numTwo.setText("");
        solution.setText("");
    }

    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    // Method to set the rounded border
    private static class RoundedBorder implements Border {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius + 3, this.radius, this.radius + 3);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width - 1, height - 1, radius + 1, radius + 1);
        }
    }

    // Methods to set properties for multiple components
    private void setComponentProperties(JComponent component, Font font, Border border, Color background) {
        component.setFont(font);
        component.setBorder(border);
        component.setBackground(background);
    }

    private void setComponentProperties(JTextField component, Font font, Border border, Color background, int alignment) {
        component.setFont(font);
        component.setBorder(border);
        component.setBackground(background);
        component.setHorizontalAlignment(alignment);
    }
}
