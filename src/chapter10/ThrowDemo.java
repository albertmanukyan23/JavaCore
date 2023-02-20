package chapter10;

public class ThrowDemo {
    static void demoProcess() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e) {
            System.out.println("Exception inside demoProcess()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProcess();
        } catch (NullPointerException e) {
            System.out.println("double catch");
        }
    }
}

