package chapter14;

public class NoGenDemo {
    public static void main(String[] args) {
        NoGen ob = new NoGen(88);
        Integer ob1 = (Integer) ob.getOb();
        System.out.println("value is equal to " + ob1);
        ob.showType();
        NoGen str = new NoGen("albert");
        String str1 = (String) str.getOb();
        System.out.println("value is equal to " + str1);
        str.showType();
    }
}
