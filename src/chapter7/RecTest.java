package chapter7;

public class RecTest {
    int[] array;

    RecTest(int n) {
        array = new int[n];
    }

    void printArray(int n) {
        if (n == 0) {
            return;
        }
        printArray(n - 1);
        System.out.println("[" + (n - 1) + "] " + array[n - 1]);
    }
}
