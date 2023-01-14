package homework.homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.plus(-150,36.5));
        System.out.println(myCalculator.minus(-65,74.4));
        System.out.println(myCalculator.multiply(14,3.5));
        System.out.println(myCalculator.divide(25,-5));
        System.out.println(myCalculator.divide(85,0));
    }
}
