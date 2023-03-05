package chapter12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnnotation {
    @AnnotationExample(str = "hello" , val = 20)
    @AnnotationExample(str = "hello my friend" , val = 50)
    static  void  myMeth(String a ,int b){
        Class<?> repeatAnnotationClass = RepeatAnnotation.class;
        try {
            Method method = repeatAnnotationClass.getDeclaredMethod("myMeth", String.class,int.class);
            Annotation annotation = method.getAnnotation(MyAnnotation2.class);
            System.out.println(annotation);
        }catch (NoSuchMethodException e){
            System.out.println("Method didn't find");
        }

    }
    public static void main(String[] args) {
        myMeth("a",40);
    }
}
