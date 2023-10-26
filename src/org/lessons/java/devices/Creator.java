package org.lessons.java.devices;

public class Creator {
    public Player create(String type){
        switch(type){
            case "dvd player":
                return new DVDPlayer();
            case "playstation":
                return new Playstation();
            default:
                throw new IllegalArgumentException("Invalid type: " + type);
        }
    }
}
