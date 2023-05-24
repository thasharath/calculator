import java.text.NumberFormat;
import java.util.Locale;

public class CalculatorModel {

    private int answer;
    private float answerFloat;

    NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);

    public void addTwoNumbers(int numOne, int numTwo) {
        answer = numOne + numTwo;
    }

    public void subTwoNumbers(int numOne, int numTwo) {
        answer = numOne - numTwo;
    }

    public void mulTwoNumbers(int numOne, int numTwo) {
        answer = numOne * numTwo;
    }

    public void divTwoNumbers(float numOne, float numTwo) {
        answerFloat = numOne / numTwo;
    }

    public String getAnswer() {
        return numberFormat.format(answer);
    }

    public String getAnswerFloat() {
        return numberFormat.format(answerFloat);
    }
}
