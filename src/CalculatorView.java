import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.UIManager.*;
import javax.swing.border.Border;


public class CalculatorView extends JFrame {

    private JTextField numOne = new JTextField(8);
    private JTextField numTwo = new JTextField(8);
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("x");
    private JButton divButton = new JButton("/");
    private JTextField solution = new JTextField(16);

    public CalculatorView() {

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
        } catch (ClassNotFoundException e) {
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        }


        JPanel panelNumbers = new JPanel();
        JPanel panelButtons = new JPanel();
        JPanel panelSolution = new JPanel();


        numOne.setFont(new java.awt.Font("Fira Code", 0, 22));
        numOne.setHorizontalAlignment(SwingConstants.RIGHT);

        numTwo.setFont(new java.awt.Font("Fira Code", 0, 22));
        numTwo.setHorizontalAlignment(SwingConstants.RIGHT);

        solution.setHorizontalAlignment(SwingConstants.RIGHT);
        solution.setFont(new java.awt.Font("Fira Code", 0, 24));

        addButton.setFont(new java.awt.Font("Fira Code", 1, 22));
        addButton.setBorder(new RoundedBorder(7));
        addButton.setBackground(new Color(0xf59806));

        subButton.setFont(new java.awt.Font("Fira Code", 1, 22));
        subButton.setBorder(new RoundedBorder(7));
        subButton.setBackground(new Color(0xf59806));

        mulButton.setFont(new java.awt.Font("Fira Code", 1, 22));
        mulButton.setBorder(new RoundedBorder(7));
        mulButton.setBackground(new Color(0xf59806));

        divButton.setFont(new java.awt.Font("Fira Code", 1, 22));
        divButton.setBorder(new RoundedBorder(7));
        divButton.setBackground(new Color(0xf59806));


        panelNumbers.setBackground(Color.GRAY);
        panelNumbers.add(numOne);
        panelNumbers.add(numTwo);

        panelButtons.setBackground(Color.GRAY);
        panelButtons.add(addButton);
        panelButtons.add(subButton);
        panelButtons.add(mulButton);
        panelButtons.add(divButton);

        panelSolution.setBackground(Color.GRAY);
        panelSolution.add(solution);


        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(280, 180);
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


//    public float getSolution() {
//        return Float.parseFloat(solution.getText());
//    }


//    public void setSolution(float s) {
//        solution.setText(Float.toString(s));
//    }

    public void setSolution(String s) {
        solution.setText(s);
    }

//    public void setSolutionFloat(String s) {
//        solution.setText(s);
//    }


    void addCalculateListener(ActionListener listenForAddButton) {
        addButton.addActionListener(listenForAddButton);
    }


    void subCalculateListener(ActionListener listen) {
        subButton.addActionListener(listen);
    }


    void mulCalculateListener(ActionListener listen) {
        mulButton.addActionListener(listen);
    }


    void divCalculateListener(ActionListener listen) {
        divButton.addActionListener(listen);
    }


    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }


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
}
