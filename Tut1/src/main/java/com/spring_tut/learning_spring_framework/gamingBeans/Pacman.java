package com.spring_tut.learning_spring_framework.gamingBeans;

public class Pacman implements Gameconsole {
    public void up() {
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Sit down");
    }

    public void left() {
        System.out.println("Go back");
    }

    public void right() {
        System.out.println("Eat a dot");
    }
}
