package org.lessons.java.animals;

public abstract class Animale {

    //    Attributi
    private String name;

    //    Costruttore

    public Animale(String name) {
        this.name = name;
    }

    //    Metodi

    public String getName() {
        return name;
    }

    public void dormi(){
        System.out.println("ZzZ");
    }

    //    Metodo astratto in quanto ogni animale ha un verso specifico

    public abstract void verso();

//    Metodo astratto in quanto ogni animale ha un cibo specifico

    public abstract void mangia();
}
