// models/Player.java
package com.example.curadinosauro.models;

import com.example.curadinosauro.models.DigiEgg;

public class Player {
    private final String name;
    private final DigiEgg digiEgg;
    private int experience;
    private int dinolar;

    public Player(String name) {
        this.name = name;
        this.digiEgg = new DigiEgg();
        this.experience = 0;
        this.dinolar = 0;
    }

    public void addDinolar(int amount) { this.dinolar += amount; }
    public void gainExperience(int xp) { this.experience += xp; }
    public int getExperience() { return experience; }
    public int getDinolar() { return dinolar; }
}
