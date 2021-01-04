package com.company.animals;

import com.company.food.Food;
import com.company.food.Grass;
import com.company.food.Meat;

public class Fish extends Carnivorous implements Swim{
    @Override
    public boolean swim() {
        setSatiety(-1);
        return true;
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
