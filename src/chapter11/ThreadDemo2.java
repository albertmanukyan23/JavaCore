package chapter11;

public class ThreadDemo2 {
    public static void main(String[] args) {
        new NewThread2("thread1");
        new NewThread2("thread2");
        new NewThread2("thread3");
        for (int i = 0; i < 10; i++) {
            System.out.println("DomainThread" + i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("DomainThread is interrupted");
            }
        }
        System.out.println("Domain tread is over");
    }
}
