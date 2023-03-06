package chapter14;

public class Coords<T extends TwoD > {
    T [] coords;

    public Coords(T[] coords) {
        this.coords = coords;
    }
}
