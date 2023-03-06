package chapter14;

public class SimGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(10, "25");
        twoGen.showTypes();
        Integer ob1 = twoGen.getOb1();
        System.out.println("ob1 value " + ob1);
        String ob2 = twoGen.getOb2();
        System.out.println("ob2 value " + ob2);
        System.out.println();
    }
}
