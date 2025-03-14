package com.example.curadinosauro.models;


public class AggressiveDinosaur extends Dinosaur {
    public AggressiveDinosaur(String name, String species, int attack, int defense, int vitality, int x, int y) {
        super(name, species, attack, defense, vitality, false, true, x, y);
    }

    @Override
    public void move() {
        x += (Math.random() > 0.5) ? 1 : -1;
        y += (Math.random() > 0.5) ? 1 : -1;
    }
}