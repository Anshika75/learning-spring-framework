package com.spring_tut.learning_spring_framework.gamingBeans;

public class GameRunner {
    private Gameconsole game;
    public GameRunner(Gameconsole game) {
        this.game = game;
    }
    public void run() {
        System.out.println("Running Game" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
