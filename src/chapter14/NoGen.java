package chapter14;

public class NoGen {
    Object ob;

    public NoGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type name is " + ob.getClass().getName());
    }
}
