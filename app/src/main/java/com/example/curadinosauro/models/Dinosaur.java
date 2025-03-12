package com.example.curadinosauro.models;

public class Dinosaur {
    private final String name;
    private final String species;
    private final int attack;
    private final int defense;
    private final int vitality;
    private boolean isSick;

    public Dinosaur(String name, String species, int attack, int defense, int vitality, boolean isSick) {
        this.name = name;
        this.species = species;
        this.attack = attack;
        this.defense = defense;
        this.vitality = vitality;
        this.isSick = isSick;
    }

    public void heal() {
        if (isSick) {
            isSick = false;
            System.out.println(name + " foi curado!");
        }
    }

    public String getName() { return name; }
    public boolean isSick() { return isSick; }
    public int getDefense() { return defense; }
}