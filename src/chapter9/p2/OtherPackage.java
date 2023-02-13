package chapter9.p2;

import chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection protection = new Protection();
        System.out.println("n_pub = " + protection.n_pub);
    }
}
