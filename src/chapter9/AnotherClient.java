package chapter9;

public class AnotherClient implements Callback {
    @Override
    public void callback(int param) {
        System.out.println(param * param);
    }
}
