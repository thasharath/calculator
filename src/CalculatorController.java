import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    public CalculatorView theView;
    public CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.listener(new CalculatorListener());
    }

    class CalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float numOne, numTwo = 0;

            try {
                numOne = theView.getNumOne();
                numTwo = theView.getNumTwo();

                if (e.getSource() == theView.getAddButton()) {
                    theModel.addTwoNumbers(numOne, numTwo);
                } else if (e.getSource() == theView.getSubButton()) {
                    theModel.subTwoNumbers(numOne, numTwo);
                } else if (e.getSource() == theView.getMulButton()) {
                    theModel.mulTwoNumbers(numOne, numTwo);
                } else if (e.getSource() == theView.getDivButton()) {
                    theModel.divTwoNumbers(numOne, numTwo);
                }

                theView.setSolution(theModel.getAnswer());
            } catch (NumberFormatException ex) {
                System.out.println(ex);
                theView.displayErrorMessage("Enter 2 Valid Numbers!!");
            }
        }
    }
}
