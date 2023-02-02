package chapter8;

public class Rectangle extends  Figure{
    @Override
    public double area() {
        System.out.println("в области четырехугольника");
        return  dim1 * dim2;
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }
}
