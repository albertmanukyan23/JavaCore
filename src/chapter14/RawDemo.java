package chapter14;

public class RawDemo {
    public static void main(String[] args) {
        GenT<Integer> iob = new GenT<>(52);
        GenT<String> iob2 = new GenT<>("52");
        GenT gt = new GenT(25.8);
        int a = (Integer) gt.getOb();
        System.out.println(a);
        iob2 =gt;
      //  String str = iob2.getOb();



    }
}
