package chapter4;

public class IncDec {
    public static void main(String[] args) {
        int a = 2;
        int b, c;
        b = a++;
        c = ++a;
        c++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
