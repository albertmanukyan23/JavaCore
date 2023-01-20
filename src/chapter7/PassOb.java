package chapter7;

public class PassOb {
    public static void main(String[] args) {
        Test myTest1 = new Test(2, 6);
        Test myTest2 = new Test(2, 6);
        System.out.println(myTest2.equalsTo(myTest1));
        System.out.println(myTest2.a + "," + myTest2.b);
        myTest2.meth(myTest2);
        System.out.println(myTest2.a + "," + myTest2.b);

    }
}
