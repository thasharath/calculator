import java.text.NumberFormat;

public class CalculatorModel {

    private float answer;

    NumberFormat numberFormat = NumberFormat.getInstance();

    public void addTwoNumbers(float numOne, float numTwo) {
        answer = numOne + numTwo;
    }

    public void subTwoNumbers(float numOne, float numTwo) {
        answer = numOne - numTwo;
    }

    public void mulTwoNumbers(float numOne, float numTwo) {
        answer = numOne * numTwo;
    }

    public void divTwoNumbers(float numOne, float numTwo) {
        // Check if divider is zero
        if (numTwo == 0) {
            throw new ArithmeticException("Cannot Divide By Zero!");
        }

        answer = numOne / numTwo;
    }

    public String getAnswer() {
        numberFormat.setMaximumFractionDigits(8);
        return numberFormat.format(answer);
    }

    public float getAnswerFloat() {
        return answer;
    }

    void setAnswerFloat(float ans) {
        answer = ans;
    }
}
