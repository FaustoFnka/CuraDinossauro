package com.example.curadinosauro.models;

public abstract class Dinosaur {
    protected String name;
    protected String species;
    protected int attack, defense, vitality;
    protected boolean isSick, isHostile;
    protected int x, y;

    public Dinosaur(String name, String species, int attack, int defense, int vitality, boolean isSick, boolean isHostile, int x, int y) {
        this.name = name;
        this.species = species;
        this.attack = attack;
        this.defense = defense;
        this.vitality = vitality;
        this.isSick = isSick;
        this.isHostile = isHostile;
        this.x = x;
        this.y = y;
    }

    public void heal() {
        if (isSick) {
            isSick = false;
        }
    }

    public abstract void move();

    public String getName() { return name; }
    public boolean isSick() { return isSick; }
    public int getX() { return x; }
    public int getY() { return y; }
}