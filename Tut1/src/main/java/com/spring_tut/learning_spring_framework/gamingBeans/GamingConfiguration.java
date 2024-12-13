package com.spring_tut.learning_spring_framework.gamingBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public Gameconsole marioGame() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(Gameconsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }
}
