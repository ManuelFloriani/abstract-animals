package org.lessons.java.animals;

public class Delfino extends Animale implements Natante{
    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("eeek-eeek");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio plancton!");
    }

    @Override
    public void nuota() {
        System.out.println("Io posso nuotare!");
    }
}
