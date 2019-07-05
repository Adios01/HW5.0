package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(700, 50, 0);
        boss.changeBossDefence();
        System.out.println(boss.printInfo());
        Door door = new Door();
        door.returnHeroes();
        Hero a = new Hero(300, 20, 1);
        System.out.println(a.printInfo());



    }
}
