package chapter11;

public class Caller implements  Runnable{
    Thread t;
    Callme target;
    String name;


    public Caller(Callme target, String name) {
        t = new Thread(this);
        this.target = target;
        this.name = name;
    }

    @Override
    public void run() {
        target.call(name);

    }
}
