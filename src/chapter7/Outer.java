package chapter7;

public class Outer {
    public int outerX = 100;

    public void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        public void display() {
            System.out.println("display");
        }
    }
}
