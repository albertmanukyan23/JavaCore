package chapter8;

public class B extends A {
    int k;

    public void showK() {
        System.out.println("k = " + k);
    }

    public void callMe() {
        System.out.println("class B callMe");
    }

    public void sum() {
        System.out.println(i + j + k);
    }
}
