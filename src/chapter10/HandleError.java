package chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for (int i = 0; i < 3200; i++) {
            try {
                a = r.nextInt();
                b = r.nextInt();
                c = 1235 / (a / b);
            }catch (ArithmeticException e ){
                System.out.println("/0");
                a = 0;
            }
        }
    }
}
