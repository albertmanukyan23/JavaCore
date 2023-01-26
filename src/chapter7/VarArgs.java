package chapter7;

public class VarArgs {
    static void vaTest(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }
}
