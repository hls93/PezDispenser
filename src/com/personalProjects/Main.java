package com.personalProjects;

import static com.personalProjects.PezDispenser.MAX_PEZ;

public class Main {

    public static void main(String[] args) {

        System.out.println("we are making a new pez despenser");

        System.out.printf("FUN FACT: there are %d PEZ allowed in every dispenser", MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Donatello");

        System.out.println("Filling the dispenser with PEZ...");
        dispenser.fill();

        if (dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }

    }
}
