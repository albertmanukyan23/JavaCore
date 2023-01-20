package chapter7;

public class OverloadDemo {
    void test() {
        System.out.println("test");
    }

    void test(int a) {
        System.out.println("with parameter");
    }

    void test(int a, int b) {
        System.out.println("with 2 parameters");
    }

    double test(double a) {
        System.out.println("double parameter ");
        return a * a;
    }
}
