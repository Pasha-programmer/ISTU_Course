package com.company.animals;

import com.company.food.Food;
import com.company.food.Grass;

public class Duck extends Herbivore implements Swim,Run,Fly,Voice {
    @Override
    public boolean run() {
        setSatiety(-1);
        return true;
    }

    @Override
    public boolean swim() {
        setSatiety(-1);
        return true;
    }

    @Override
    public boolean fly() {
        setSatiety(-1);
        return true;
    }

    @Override
    public String voice() {
        setSatiety(-1);
        return "Кря кря";
    }

    @Override
    public String eat(Food food) {
        if(food instanceof Grass) {
            setSatiety(1);
            return "Омномном";
        }
        else return "O.o";
    }
}
