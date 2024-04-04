package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: D:\decomp\classes.dex */
public @interface Index {
    String name() default "";

    boolean unique() default false;

    String[] value();
}
