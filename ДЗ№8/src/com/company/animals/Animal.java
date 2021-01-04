package com.company.animals;

import com.company.OptionsAviary;
import com.company.food.Food;

public abstract class Animal {
    public abstract String eat(Food food);

    //требуемый размер вольера
    private OptionsAviary size;

    public OptionsAviary getSize() {
        return size;
    }

    protected void setSize(OptionsAviary size) {
        this.size = size;
    }

    //имя животного
    private String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if(name != "")
            this.name = name;
        else throw new IllegalArgumentException("Невозможное имя животного");
    }

    //ссытость животного
    private int satiety = 3;

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety += satiety;
    }


}
