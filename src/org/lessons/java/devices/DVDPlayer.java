package org.lessons.java.devices;

public class DVDPlayer implements Player{
    @Override
    public void play() {
        System.out.println("I'm a DVDPlayer, I'm playing a DVD");
    }

    @Override
    public void stop() {
        System.out.println("I'm a DVDPlayer, I'm stopping a DVD");
    }
}
