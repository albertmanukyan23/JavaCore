package chapter10;

public class Ecp2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int a = 42 / d;
            System.out.println("something that we will never see");
        } catch (ArithmeticException e) {
            System.err.println("/0");
        }
    }
}
