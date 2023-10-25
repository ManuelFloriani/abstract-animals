package org.lessons.java.animals;

public class Cane extends Animale{
    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("BauBau!");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio ossa!");
    }
}
