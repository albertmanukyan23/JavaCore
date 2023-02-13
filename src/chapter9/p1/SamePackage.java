package chapter9.p1;

public class SamePackage {
    public SamePackage() {
        Protection protection = new Protection();
        System.out.println("n=" + protection.n);
        System.out.println("n_pro=" + protection.n_pro);
        System.out.println("n_pub=" + protection.n_pub);
    }
}
