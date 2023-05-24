import java.text.NumberFormat;
import java.util.Locale;

public class CalculatorModel {

    private float answer;
//    private float answerFloat;

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
        answer = numOne / numTwo;
    }

    public String getAnswer() {
        numberFormat.setMaximumFractionDigits(4);
        return numberFormat.format(answer);

//        return answer;
    }

//    public String getAnswerFloat() {
//        return numberFormat.format(answerFloat);
//    }
}
