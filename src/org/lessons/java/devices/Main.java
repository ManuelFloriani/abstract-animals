package org.lessons.java.devices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Creator creator = new Creator();
        System.out.println("Which player?");
        String choice = scan.nextLine();
        try {
            Player player = creator.create(choice);
            player.play();
            player.stop();
        }
        catch (IllegalArgumentException e){
        System.out.println(e.getMessage());
        }
        scan.close();
    }
}
