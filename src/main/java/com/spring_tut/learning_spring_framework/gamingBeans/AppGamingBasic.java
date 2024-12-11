package com.spring_tut.learning_spring_framework.gamingBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasic {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(Gameconsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }
}
