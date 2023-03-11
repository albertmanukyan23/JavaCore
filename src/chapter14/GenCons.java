package chapter14;

public class GenCons {
    private double value;

    public <T extends Number> GenCons(T arg) {
        value = arg.doubleValue();
    }
    public void showVal(){
        System.out.println(value);
    }
}
