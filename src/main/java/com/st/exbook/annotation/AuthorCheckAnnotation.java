package com.st.exbook.annotation;

import java.lang.annotation.*;

/**
 * Created by e604845 on 5/16/2017.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface  AuthorCheckAnnotation {

    // 是否进行权限检查
    boolean value() default false;
}
