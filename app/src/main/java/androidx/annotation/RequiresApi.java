package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@Retention(RetentionPolicy.CLASS)
/* loaded from: D:\decomp\classes.dex */
public @interface RequiresApi {
    int api() default 1;

    int value() default 1;
}
