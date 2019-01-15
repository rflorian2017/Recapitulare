package com.company;

import com.company.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Peripheral keyboard;
        keyboard = new Keyboard("keyboard");

        Peripheral mouse = new Mouse("mouse", 2);

        System.out.println(keyboard.displayName());
        Mouse mouse2 = new Mouse("mouse",
                3);

        BallCharacteristic mousewithBalls =
                new Mouse("acer", 6);
        mousewithBalls.setBallMaterial("Rubber");
        System.out.println("Mouse characteristics for " + ((Mouse) mousewithBalls).displayName());
        System.out.println(((Mouse) mousewithBalls).displayCharacteristics());


        System.out.println("Second mouse: " +
                mouse2.displayName());


        Computer intel = new Computer("Intel",
                "Desktop");
        intel.addPeripheral(mouse2);
        intel.addPeripheral(keyboard);


        System.out.println(intel.displayPeripherals());

        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        System.out.println("LIST INIT:");
        for (int nr : numbers) {
            System.out.print(nr + " ");
        }
        boolean found = false;
        for (int currentNumberInList : numbers) {
            if(currentNumberInList!=3) {
                found = false;
            }
            else {
                found = true;
                break;
            }
        }

        if(found == false) {
            //daca 3 nu exista, il adaug
            numbers.add(3);
        }
        System.out.println("LIST AFTER adding 4:");
        for (int nr : numbers) {
            System.out.print(nr + " ");
        }

        if(!numbers.contains(4)) {
            numbers.add(4);
        }
        System.out.println("LIST AFTER adding 4:");
        for (int nr : numbers) {
            System.out.print(nr + " ");
        }




    }
}
