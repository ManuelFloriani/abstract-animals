package org.lessons.java.animals;

public class Aquila extends Animale implements Volante{
    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("ScreeScree");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio topi!");
    }

    @Override
    public void vola() {
        System.out.println("Io posso volare!");
    }


}
