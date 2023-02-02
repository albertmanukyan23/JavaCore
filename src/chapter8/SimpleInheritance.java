package chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.i = 10;
        a.j = 15;
        a.showIJ();
        b.i = 40;
        b.j = 40;
        b.k = 40;
        b.showK();
        b.sum();
    }
}
