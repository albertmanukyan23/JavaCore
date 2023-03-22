package chapter11;

public class Callme {
   synchronized void call(String msg) {
        System.out.println("[" + msg );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("stopped");
        }
        System.out.println("]");
    }
}
