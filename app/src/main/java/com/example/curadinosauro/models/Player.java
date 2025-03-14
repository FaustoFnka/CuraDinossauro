// models/Player.java
package com.example.curadinosauro.models;

public class Player {
    private final String name;
    private final DigiEgg digiEgg;
    private int experience;
    private int dinolar;
    private int x, y;
    private int health;

    public Player(String name) {
        this.name = name;
        this.digiEgg = new DigiEgg();
        this.experience = 0;
        this.dinolar = 0;
        this.x = 0;
        this.y = 0;
        this.health = 100;
    }

    public void addDinolar(int amount) { this.dinolar += amount; }
    public void gainExperience(int xp) { this.experience += xp; }
    public int getExperience() { return experience; }
    public int getDinolar() { return dinolar; }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
}
