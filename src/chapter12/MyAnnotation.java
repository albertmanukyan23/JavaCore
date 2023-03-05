package chapter12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String str() default "annotation";
    int val() default  -100;
}
