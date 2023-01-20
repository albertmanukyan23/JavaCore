package chapter7;

public class Test {
    int a, b;
    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalsTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
    void meth(int i, int j) {
        i*=2;
        j*=2;
    }
}
