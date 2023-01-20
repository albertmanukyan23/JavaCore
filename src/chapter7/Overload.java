package chapter7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo old = new OverloadDemo();
        old.test();
        old.test(5);
        old.test(5, 6);
        double a = old.test(25.4);
        System.out.println(a);
    }
}
