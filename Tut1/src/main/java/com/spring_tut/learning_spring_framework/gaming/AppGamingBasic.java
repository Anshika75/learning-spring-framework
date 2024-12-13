package com.spring_tut.learning_spring_framework.gaming;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        System.out.println("\nPlaying Super Contra Game");
        gameRunner.run();
        var gameRunner2 = new GameRunner(marioGame);
        System.out.println("\nPlaying Mario Game");
        gameRunner2.run();
        var gameRunner3 = new GameRunner(new Pacman());
        System.out.println("\nPlaying Pacman Game");
        gameRunner3.run();
    }
}
