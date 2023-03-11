package chapter14;

public class Gen3<T> extends NoGen2 {
    T t ;

    public Gen3(int nums, T t) {
        super(nums);
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
