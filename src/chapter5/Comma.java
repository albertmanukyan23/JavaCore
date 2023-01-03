package chapter5;

public class Comma {
    public static void main(String[] args) {
        int i, j;
        for (i = 0, j = 5; i < j; j--, i++) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }
    }
}
