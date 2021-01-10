package com.grapefruit;

import com.grapefruit.mark.Inject;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author 柚子苦瓜茶
 * @version 1.0
 */
@Component
public class MyInject implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        // 初始化属性(给属性赋值,参考spring中的@Autowire)
        initField(applicationContext);
    }
    public void initField(ApplicationContext context){
        try{
            // 获取bean的名字
            String[] names = context.getBeanDefinitionNames();
            for (String name : names) {
                //System.out.println("name:" + name);
                // 遍历获取bean对象
                if(name.equals("a") || name.equals("b")){
                    // 获取bean对象
                    Object bean = context.getBean(name);
                    // 获取对象的字节码
                    Class<?> beanClass = bean.getClass();
                    System.out.println("beanClass:" + beanClass);
                    Field[] fields = beanClass.getDeclaredFields();
                    for (Field field : fields) {
                        if(!field.isAnnotationPresent(Inject.class)){
                            // 如果该注解上没有使用@Inject注解,不对该属性赋值
                            continue;
                        }
                        // 属性的class
                        Class<?> type = field.getType();
                        // 打破属性封装
                        field.setAccessible(true);
                        // 获取属性类型后从context获取对象并给当前对象赋值
                        field.set(bean,context.getBean(type.getSimpleName().toLowerCase()));

                        // 属性的名称
                        String fieldName = field.getName();
                        System.out.println("type:" + type + "       fieldName:" + fieldName);
                    }
                    System.out.println();
                }
                continue;
            }

        }catch (Exception e){
            //UndeclaredThrowableException exception = (UndeclaredThrowableException) e;
            System.out.println("????:" + e.getMessage());
        }
    }
}
