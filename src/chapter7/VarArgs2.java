package chapter7;

public class VarArgs2 {
    static void vaTest(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
    static void vaTest(boolean... v) {
        for (boolean x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
    static void vaTest(String a , int... v) {
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
}
