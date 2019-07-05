package com.company;

public class Hero {

    int health;
    int hits;
    int hitTipes;

    public Hero(int health, int hits, int  hitTipes){
        this.health = health;
        this.hits = hits;
        this.hitTipes = hitTipes;

    }

    public String printInfo() {
        return "HERO:"  + " "+  health + " " + hits + " " + hitTipes;
    }

}
