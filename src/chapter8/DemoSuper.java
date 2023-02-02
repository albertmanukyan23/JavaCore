package chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(cube);
        System.out.println(cube.volume());
        System.out.println(cube.weight);
        System.out.println(myClone.volume());
        System.out.println(myClone.weight);
    }
}
