package chapter7;

public class NewTest {
    int a;
    NewTest(int i) {
        a = i;
    }
    NewTest incrByTen() {
        NewTest nt = new NewTest(a + 10);
        return  nt;
    }
}
