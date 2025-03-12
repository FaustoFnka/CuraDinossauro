package com.example.curadinosauro.models;

import java.util.HashSet;

public class DigiEgg {
    private static final int MAX_CAPACITY = 30;
    private final HashSet<String> storedDinosaurs;

    public DigiEgg() {
        this.storedDinosaurs = new HashSet<>();
    }

    public boolean storeDinosaur(Dinosaur dino) {
        if (storedDinosaurs.size() < MAX_CAPACITY && !storedDinosaurs.contains(dino.getName())) {
            storedDinosaurs.add(dino.getName());
            return true;
        }
        return false;
    }
}