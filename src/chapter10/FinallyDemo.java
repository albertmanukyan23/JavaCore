package chapter10;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("in procA()");
            throw new RuntimeException("DEMONSTRATION");
        } finally {
            System.out.println("finally inside procA");
        }
    }

    static void procB() {
        try {
            System.out.println("in procB()");
            return;
        } finally {
            System.out.println("finally inside procB");
        }
    }

    static void procC() {
        try {
            System.out.println("in procC()");
        } finally {
            System.out.println("finally inside procC");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception was caught");
        }
        procB();
        procC();
    }

}
