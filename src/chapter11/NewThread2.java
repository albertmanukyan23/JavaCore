package chapter11;

public class NewThread2 implements Runnable {
    String name;
    Thread t;

    public NewThread2(String name) {
        this.name = name;
        this.t = new Thread(this, name);
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " is interrupted");
            }
            System.out.println(name + "is over");
        }

    }
}
