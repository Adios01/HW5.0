package com.company;

import java.util.Random;

public class Boss {

    private int health;
    private int hits;
    private int hitTypes;


    public Boss(int health, int hits, int hitTypes) {
        this.setHealth(health);
        this.setHits(hits);
        this.setHitTypes(hitTypes);
    }

    public void changeBossDefence() {
        Random r = new Random();
        int randomNumber = r.nextInt(4)+1;
        setHitTypes(randomNumber);
    }

    public String printInfo() {
        return "BOSS:" + " " + getHealth() + " " + getHits() + " " + getHitTypes();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHitTypes() {
        return hitTypes;
    }

    public void setHitTypes(int hitTypes) {
        this.hitTypes = hitTypes;
    }
}

