package chapter7;

public class UseStatic {
    public static int a;
    public static int b;
    public final int A ;
    UseStatic(){A=25;}

    public static void meth(int x) {
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("x= " + x);

    }

}
