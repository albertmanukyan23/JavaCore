package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        System.out.println("homework 8 test ");
        DynamicArray da = new DynamicArray();
        // test of add
        for (int i = 0; i < 15; i++) {
            da.add(4);
        }
        da.print();
        // test getByIndex
        System.out.println();
        da.add(5);
        System.out.println(da.getByIndex(15));
        // test deleteByIndex
        da.add(18);
        da.add(19);
        da.deleteByIndex(16);
        da.print();
        // test the second  deleteByIndex function
        System.out.println();

        System.out.println("Homework 9 test");
        da.split(14, 16);
        da.print();
        System.out.println();
        da.add(45);
        da.add(48);
        da.deleteByIndex(2);
        da.print();
        da.set(1,5);
        da.print();
        da.add(2,0);
        da.print();
        for (int i = 0; i < 6; i++) {
            da.add(5);
        }
        da.print();
        da.add(9,8);
        da.print();
        System.out.println(da.exists(5));
        System.out.println(da.getIndexByValue(48));
        da.add(-8,25);
    }
}
