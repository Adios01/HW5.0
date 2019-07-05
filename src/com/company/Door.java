package com.company;

public class Door {
    public Hero[] returnHeroes(){
        Hero[] heroesArr = new Hero[4];
        Hero adilet = new Hero(250, 35, 1);
        heroesArr[0] = adilet;
        Hero adilhan = new Hero(230, 20, 2);
        heroesArr[1] =adilhan;
        Hero nail = new Hero(300, 15, 3);
        heroesArr[2] =nail;
        Hero taalai = new Hero(330, 35, 4);
        heroesArr[3] = taalai;

        return heroesArr;
    }
}
