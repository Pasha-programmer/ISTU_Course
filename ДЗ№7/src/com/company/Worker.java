package com.company;

import com.company.animals.*;
import com.company.food.Food;

public class Worker {
    //покормить любое животное любой едой
    void feed(Animal animal, Food food){
        System.out.println(animal + " + " + food + " = " + animal.eat(food));
    }

    //попросить животное подать голос
    void getVoice(Voice animal)
    {
        System.out.println(animal.voice());
    }
}

