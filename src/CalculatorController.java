import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    public CalculatorView theView;
    public CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new AddListener());
        this.theView.subCalculateListener(new SubListener());
        this.theView.mulCalculateListener(new MulListener());
        this.theView.divCalculateListener(new DivListener());
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numOne, numTwo = 0;

            try {
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();
                theModel.addTwoNumbers(numOne, numTwo);
                theView.setSolution(theModel.getAnswer());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 integers");
            }
        }
    }

    class SubListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numOne, numTwo = 0;

            try {
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();
                theModel.subTwoNumbers(numOne, numTwo);
                theView.setSolution(theModel.getAnswer());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 integers");
            }
        }
    }

    class MulListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numOne, numTwo = 0;

            try {
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();
                theModel.mulTwoNumbers(numOne, numTwo);
                theView.setSolution(theModel.getAnswer());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 integers");
            }
        }
    }
    class DivListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int numOne, numTwo = 0;

            try {
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();
                theModel.divTwoNumbers(numOne, numTwo);
                theView.setSolutionFloat(theModel.getAnswerFloat());
            } catch(NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter 2 integers");
            }
        }
    }
}
