package com.grapefruit.run;

import com.grapefruit.mark.Inject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Setter
@Getter
@Component
public class A {
    @Inject
    private B b;

    //private String name;


    /*@Override
    public String toString() {
        return "A{" +
                "b=" + b +
                '}';
    }*/
}
