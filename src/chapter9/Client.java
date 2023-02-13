package chapter9;

public class Client implements Callback {
    @Override
    public void callback(int param) {
        System.out.println(param);
    }
}
