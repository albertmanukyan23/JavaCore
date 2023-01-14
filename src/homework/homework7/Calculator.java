package homework.homework7;

public class Calculator {
    public double plus(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            System.err.println("You can't divide by zero!");
            return -1;
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
}
