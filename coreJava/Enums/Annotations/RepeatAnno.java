package coreJava.Enums.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno{
    String str() default "Testing";
    int val() default 800;
 }

 @Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
 MyAnno[] value();
}

public class RepeatAnno {
    
    @MyAnno(str = "First Annotation",val=-1)
    @MyAnno(str = "SecondAnnotation",val=100)
    public static void myMeth(String str,int i){
        RepeatAnno rp=new RepeatAnno();

        try {
            Class<?> c=rp.getClass();

            Method m=c.getMethod("myMeth",String.class,Integer.class);

            Annotation annotation=m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(annotation);
        } catch (NoSuchMethodException ex) {
            // TODO: handle exception
            System.out.println("Method not found.");
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }

}
