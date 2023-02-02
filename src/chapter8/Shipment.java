package chapter8;

public class Shipment extends BoxWeight {
    double cost;
    public Shipment(int len, double m, double cost) {
        super(len, m);
        this.cost = cost;
    }

    public Shipment(double cost) {
        this.cost = cost;
    }

    public Shipment(Shipment bw){
        super(bw);
        this.cost = bw.cost;
    }

    public Shipment(double w, double h, double d, double m, double cost) {
        super(w, h, d, m);
        this.cost = cost;
    }
}
