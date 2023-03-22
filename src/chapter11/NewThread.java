package chapter11;

public class NewThread implements  Runnable{
    private Thread t ;

    public NewThread() {
        this.t = new Thread(this , "myThread");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("myThread" + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("myThread eas interrupted");
            }
        }
        System.out.println("myThread is over");

    }
}
