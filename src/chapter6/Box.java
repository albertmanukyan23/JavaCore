package chapter6;

class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.depth = depth;
        this.width = width;
        this.height = height;

    }

    public void setDim(double width, double height, double depth) {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return width * height * depth;
    }
}