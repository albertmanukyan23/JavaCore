package chapter14;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    private T[] values;

    public MyClass(T[] values) {
        this.values = values;
    }

    @Override
    public T min() {
        T v = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) < 0)
                v = values[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) > 0)
                v = values[i];
        }
        return v;
    }
}
