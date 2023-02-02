package chapter8;

public class Triangle extends Figure {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        System.out.println("в области Треугольник ");
        return dim1 * dim2 / 2;
    }
}
