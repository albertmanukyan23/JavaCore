package chapter8;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight bw) {
        super(bw);
        weight = bw.weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(int len, double m) {
        super(len);
        weight = m;
    }
}
