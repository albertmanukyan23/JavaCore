package chapter8;

public abstract class Figure {
    public double dim1;
    public double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();
}
