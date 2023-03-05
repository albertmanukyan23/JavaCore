package chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("ap = " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("Apple has goldenDel");
        }
        switch (ap) {
            case Winesap:
                System.out.println("Winesap");
                break;
            case RedDel:
                System.out.println("RedDel");
                break;
            case Cortland:
                System.out.println("Cortland");
                break;
            case Jonathan:
                System.out.println("Jonathan");
                break;
            case GoldenDel:
                System.out.println("GoldenDel");
        }
    }
}
