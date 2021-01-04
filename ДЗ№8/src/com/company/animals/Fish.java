package com.company.animals;

import com.company.OptionsAviary;
import com.company.WrongFoodException;
import com.company.food.Food;
import com.company.food.Grass;
import com.company.food.Meat;

public class Fish extends Carnivorous implements Swim{
    public Fish(String name, OptionsAviary size){
        this.setName(name);
        if(size.equals(sizeAviary))
            this.setSize(size);
        else System.out.println("Данный вольер размера " + size + " не подходит для животного " + this.getClass() +
                "\n(Требуется вольер размера " + sizeAviary + ")");
    }
    private OptionsAviary sizeAviary = OptionsAviary.S;

    public OptionsAviary getSizeAviary() {
        return sizeAviary;
    }

    @Override
    public boolean swim() {
        setSatiety(-1);
        return true;
    }

    @Override
    public String eat(Food food)  {
        if(food instanceof Meat) {
            setSatiety(1);
            return "Омномном";
        }
        else try {
            throw new WrongFoodException(this.getClass().toString() + " не ест " + food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
            return "O.o я не буду это есть";
        }
    }
}
