package com.company.animals;

import com.company.food.Food;
import com.company.food.Meat;

public class Hawk extends Carnivorous implements Run,Fly,Voice {
    @Override
    public boolean run() {
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
        return "Тяяа тяяа тяяяааа";
    }

    @Override
    public String eat(Food food) {
        if(food instanceof Meat) {
            setSatiety(1);
            return "Омномном";
        }
        else return "O.o";
    }
}
