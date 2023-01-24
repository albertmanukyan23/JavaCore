package chapter7;

public class AccessTest {
    public static void main(String[] args) {
        TestExample tm = new TestExample();
        tm.b = 100;
        tm.setC(484);
        System.out.println(tm.getC());

    }
}
