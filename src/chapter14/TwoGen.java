package chapter14;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
    void showTypes(){
        System.out.println("value of ob1" + ob1.getClass().getName());
        System.out.println("value of ob2" + ob2.getClass().getName());
    }
}
