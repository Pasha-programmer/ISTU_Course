package com.company.animals;

import com.company.food.Food;

public abstract class Animal {
    public abstract String eat(Food food);
    private int satiety = 3;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety += satiety;
    }
}
