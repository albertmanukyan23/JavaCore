package chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        for (int i = 0; i < 5; i++) {
            System.out.println("main" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("main was interrupted");
            }
        }
        System.out.println("main is over");
    }
}
