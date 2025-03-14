package com.example.curadinosauro.models;

public class PassiveDinosaur extends Dinosaur {
    public PassiveDinosaur(String name, String species, int attack, int defense, int vitality, boolean isSick, int x, int y) {
        super(name, species, attack, defense, vitality, isSick, false, x, y);
    }

    @Override
    public void move() {
        x += (Math.random() > 0.5) ? 1 : -1;
        y += (Math.random() > 0.5) ? 1 : -1;
    }
}
