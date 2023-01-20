package chapter7;

public class NewTestDemo {
    public static void main(String[] args) {
        NewTest nt = new NewTest(5);
        NewTest nt2 = nt.incrByTen();
        System.out.println(nt2.a);
        nt2 = nt2.incrByTen();
        System.out.println(nt2.a);
    }
}
