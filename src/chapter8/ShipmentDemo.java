package chapter8;

public class ShipmentDemo {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment( 10,35 , 78 , 10.1 , 52);
        Shipment shipment2 = new Shipment( 10,35 , 70 , 1.4 , 2);
        System.out.println(shipment1.volume());
        System.out.println(shipment2.volume());
        System.out.println(shipment1.cost);
        System.out.println(shipment2.cost);
    }
}
