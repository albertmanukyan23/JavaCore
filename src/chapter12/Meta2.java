package chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "description")
@MyAnnotation(str = "something", val = 50)
public class Meta2 {
    @What(description = "S")
    @MyAnnotation(str = "ANYTHING", val = 100)
    public static void myMeth() {
        Class<?> cl = Meta2.class;
        Annotation[] annotations = cl.getAnnotations();
        System.out.println("All annotations in Meta2 ");
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println();
        try {
            Method m = cl.getMethod("myMeth");
            Annotation[] annotations1 = m.getAnnotations();
            for (Annotation annotation : annotations1) {
                System.out.println(annotation);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method didn't find ");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
