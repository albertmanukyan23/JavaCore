package chapter10;

public class ChainExcDemo {
    static void demoProcess() {
        NullPointerException e = new NullPointerException("level");
        e.initCause(new ArithmeticException());
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProcess();
        } catch (NullPointerException e) {
            System.out.println("it was caught " + e);
            System.out.println("Reason is" + e.getCause());
            e.printStackTrace();
        }
    }
}
