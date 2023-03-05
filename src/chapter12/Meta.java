package chapter12;

import java.lang.reflect.Method;

public class Meta {
    @MyAnnotation(str = "Al", val = 10)
    public static void myMeth() {
        Meta o = new Meta();
        try {
            Class<?> ob = Meta.class;
            Method method = ob.getMethod("myMeth");
            MyAnnotation ma = method.getAnnotation(MyAnnotation.class);
            System.out.println(ma.val() + " " + ma.str());
        } catch (NoSuchMethodException e) {
            System.out.println("Method didn't find");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
