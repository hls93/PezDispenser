package com.personalProjects;

public class PezDispenser {
    final private String characterName;
    public static final int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public void fill(int pezAmount) {
        int newAmount = pezCount += pezAmount;
        if (newAmount > MAX_PEZ) {
            throw new IllegalArgumentException("Too many PEZ!");
        }
        pezCount = newAmount;
    }

    public boolean dispense() {
        boolean wasDispensed = false;
        if(!isEmpty()) {
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }

    public int getPezCount() {
        return pezCount;
    }

    public void setPezCount(int pezCount) {
        this.pezCount = pezCount;
    }

    public String getCharacterName() {
        return characterName;
    }

    public String setCharacterName() {
        return characterName;
    }
}
