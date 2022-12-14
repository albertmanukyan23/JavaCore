package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;  //hasaneli e bolori main andamnerin
        x = 10;
        if (x == 10) { //skizb
            int y = 20;
            System.out.println("x= " + x + "y= " + y);
            //y hasaneli e metodi mej

        }
        // y=10; sxal e

    }


}
