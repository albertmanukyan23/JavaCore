package chapter9.p1;

import chapter9.Callback;

public class Derived extends Protection implements Callback {
    public Derived(){
        System.out.println();
        System.out.println("n=" + n);
      //  System.out.println("n_pri=" + n_pri);
        System.out.println("n_pro=" + n_pro);
        System.out.println("n_pub=" + n_pub);
    }

    @Override
    public void callback(int param) {

    }
}
