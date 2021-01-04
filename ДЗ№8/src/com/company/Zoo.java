package com.company;

import com.company.animals.*;
import com.company.food.*;

public class Zoo {
    public void ActionInZoo()  {
        //количество животных в пруду
        int countAnimalsSwiming = 5;

        //пруд
        var pond = new Swim[countAnimalsSwiming];

        //работник
        var leo = new Worker();

        //хищники
        var wolf = new Wolf("Вася", OptionsAviary.L);
        var hawk = new Hawk("Скорость", OptionsAviary.M);
        var fish = new Fish("Амазонка", OptionsAviary.S);

        //травоядные
        var deer = new Deer("Бэмби", OptionsAviary.L);
        var duck = new Duck("Вудди", OptionsAviary.S);
        var elephant = new Elephant("Ушастик", OptionsAviary.XL);

        //еда для травоядных
        var cucumber = new Cucumber();
        var cabbage = new Cabbage();
        var carrot = new Carrot();

        //еда для хищников
        var beef = new Beef();
        var chicken = new Chicken();
        var pork = new Pork();

        //кормим животных
        leo.feed(wolf, cucumber);
        leo.feed(hawk, cabbage);
        leo.feed(fish, beef);
        leo.feed(deer, chicken);
        leo.feed(duck, carrot);
        leo.feed(elephant, pork);

        System.out.println();

        //просим подать голос
        leo.getVoice(wolf);
        leo.getVoice(hawk);
        //leo.getVoice(fish);//ошибка
        //leo.getVoice(deer);//ошибка
        leo.getVoice(duck);
        //leo.getVoice(elephant);//ошибка

        System.out.println();

        //нумеруем всех плавающих животных
        pond[0] = wolf;
        pond[1] = fish;
        pond[2] = deer;
        pond[3] = duck;
        pond[4] = elephant;

        //смотрим, как в пруду плавают животные
        for (var e : pond) {
            System.out.println(e + " - " + e.swim());
        }
    }
}
