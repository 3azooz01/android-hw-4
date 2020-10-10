package com.example.pokemontrainerapp;

import java.io.Serializable;

public class Pokemon implements Serializable {
    private String name;
    private int image;
    private int attack;
    private int defense;
    private int total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Pokemon(String name, int image, int attack, int defense, int total) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defense = defense;
        this.total = total;
    }
}
