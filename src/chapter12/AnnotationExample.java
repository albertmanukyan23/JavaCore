package chapter12;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotation2.class)
public @interface AnnotationExample {
    String str() default "Тестирование";
    int val() default 9000;
}
