package com.personalProjects;

import static com.personalProjects.PezDispenser.MAX_PEZ;

public class Main {

    public static void main(String[] args) {

        System.out.println("we are making a new pez despenser");

        System.out.printf("FUN FACT: there are %d PEZ allowed in every dispenser", MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with PEZ...");
        dispenser.fill();

        if (!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }

        while (dispenser.dispense()) {
            System.out.println("chomp");
        }
        if (dispenser.isEmpty()){
            System.out.println("no more Pez");
        }

        dispenser.fill(4);
        dispenser.fill(2);
        while (dispenser.dispense()) {
            System.out.println("eat");
        }
        try {
            dispenser.fill(400);
            System.out.println();
        } catch (IllegalArgumentException iae){
            System.out.println("Illegal");
//            System.out.println(iae.getMessage(), "The error was %s");
        }


    }
}
