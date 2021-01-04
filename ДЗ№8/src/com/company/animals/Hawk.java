package com.company.animals;

import com.company.OptionsAviary;
import com.company.WrongFoodException;
import com.company.food.Food;
import com.company.food.Meat;

public class Hawk extends Carnivorous implements Run,Fly,Voice {
    public Hawk(String name, OptionsAviary size){
        this.setName(name);
        if(size.equals(sizeAviary))
            this.setSize(size);
        else System.out.println("Данный вольер размера " + size + " не подходит для животного " + this.getClass() +
                "\n(Требуется вольер размера " + sizeAviary + ")");
    }
    private OptionsAviary sizeAviary = OptionsAviary.M;

    public OptionsAviary getSizeAviary() {
        return sizeAviary;
    }

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
        if (food instanceof Meat) {
            setSatiety(1);
            return "Омномном";
        } else try {
            throw new WrongFoodException(this.getClass().toString() + " не ест " + food);
        } catch (WrongFoodException e) {
            e.printStackTrace();
            return "O.o я не буду это есть";
        }
    }
}
