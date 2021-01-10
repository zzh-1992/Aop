package com.grapefruit.mark;

import java.lang.annotation.*;

/**
 * 自定义注入注解
 *
 * @author 柚子苦瓜茶
 * @version 1.0
 */

@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Inject {
}
