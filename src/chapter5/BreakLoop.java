package chapter5;

public class BreakLoop {
    public static void main(String[] args) {
        int i = 100;
        while (i > 0) {
            System.out.println("i = " + i);
            if (i == 90) {
                break;
            }
            i--;
        }
    }
}
