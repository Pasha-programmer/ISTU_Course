package com.company.animals;

import com.company.food.Food;
import com.company.food.Meat;

public class Wolf extends Carnivorous implements Swim,Run,Voice {
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
    public String voice() {
        setSatiety(-1);
        return "Ауууууууууу";
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
