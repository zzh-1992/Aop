package com.grapefruit.mark;

import java.lang.annotation.*;

/**
 * AOP标记注解（在需要的方法上使用该注解）
 *
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyException {
}
