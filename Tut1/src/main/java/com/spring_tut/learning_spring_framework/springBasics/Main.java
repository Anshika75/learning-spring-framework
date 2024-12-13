package com.spring_tut.learning_spring_framework.springBasics;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(FirstConfiguration.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person3Parameter"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
