package chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double a = 323.145;
        System.out.println("\nпреобразование типа int в byte");
        b = (byte) i;
        System.out.println("i = " + i + "b = " + b);
        System.out.println("преобразование типа double в int");
        i=(int)a;
        System.out.println("a = " + a + "i = " + i);
        System.out.println("преобразование типа double в byte");
        b= (byte)a;
        System.out.println("a = " + a+ "b = " + b);


    }
}
