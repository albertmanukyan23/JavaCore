package chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread" + thread);
        thread.setName("myMain");
        System.out.println("Changing name" + thread);

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println("Thread is stopped");
            }
        }

    }
}
