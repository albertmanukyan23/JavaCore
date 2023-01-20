package chapter7;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(int len) {
        width = height = depth = len;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    double volume() {
        return width * height * depth;
    }
}
