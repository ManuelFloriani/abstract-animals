package org.lessons.java.devices;

public class Playstation implements Player{
    @Override
    public void play() {
        System.out.println("I'm a Playstation, I'm playing a game");
    }

    @Override
    public void stop() {
        System.out.println("I'm a Playstation, I'm stopping a game");
    }
}
