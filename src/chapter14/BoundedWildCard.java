package chapter14;

public class BoundedWildCard {
    static void showXY(Coords<?> c) {
        System.out.println("x and y ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("x ,y and z");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
            System.out.println();
        }
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("x ,y ,z and d");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].d);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TwoD[] td = {new TwoD(4, 4), new TwoD(10, 85), new TwoD(70, 96)};
        Coords<TwoD> coords = new Coords<>(td);
        showXY(coords);
        //showAll(coords);
        //showXYZ(coords);
        FourD[] f = {new FourD(1, 5, 80, 9), new FourD(40, 50, 632, 85)};
        Coords<FourD> coords1 = new Coords<>(f);
        showXYZ(coords1);
        showAll(coords1);
        showXY(coords);
    }
}
