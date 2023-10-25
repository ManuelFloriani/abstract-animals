package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante{
    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("CipCip!");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio semini!");
    }

    @Override
    public void vola() {
        System.out.println("Io posso volare!");
    }
}
