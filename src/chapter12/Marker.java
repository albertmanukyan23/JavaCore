package chapter12;

import java.lang.reflect.Method;

public class Marker {
    public static void main(String[] args) {
        myMeth();
    }

    @MyMarker

    public static void myMeth() {
        try {
            Class<?> ob = Marker.class;
            Method method = ob.getMethod("myMeth");
            if (method.isAnnotationPresent(MyMarker.class)){
                System.out.println("Marker is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method didn't find");
        }
    }
}
