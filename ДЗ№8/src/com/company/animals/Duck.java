package com.company.animals;

import com.company.OptionsAviary;
import com.company.WrongFoodException;
import com.company.food.Food;
import com.company.food.Grass;

public class Duck extends Herbivore implements Swim,Run,Fly,Voice {
    public Duck(String name, OptionsAviary size){
        this.setName(name);
        //проверяем, подходит ли данный вольер для животного
        if(size.equals(sizeAviary))
            this.setSize(size);
        else System.out.println("Данный вольер размера " + size + " не подходит для животного " + this.getClass() +
                "\n(Требуется вольер размера " + sizeAviary + ")");
    }
    private OptionsAviary sizeAviary = OptionsAviary.L;

    public OptionsAviary getSizeAviary() {
        return sizeAviary;
    }

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
    public String eat(Food food)  {
        if(food instanceof Grass) {
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
