package com.company;

import java.util.Random;

enum Eat{
    fish,
    meat,
    milk,
    soup;
}
class Kotik {
    private static int count = 0;

    public void SetKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public static int getCount() {
        return count;
    }

    private int prettiness;

    public int getPrettiness() {
        return prettiness;
    }

    private String name;

    public String getName() {
        return name;
    }

    private int weight;

    public int getWeight() {
        return weight;
    }

    private String meow;

    public String getMeow() {
        return meow;
    }

    private int Satiety;

    public int getSatiety() {
        return Satiety;
    }

    public Kotik(){
        count++;
    }

    public Kotik(int number){
        count += number;
    }

    void  liveAnotherDay(){
        for(var i = 0; i < 24; i++) {
            switch ((int)(Math.random()*5)) {
                case(0): {
                    var answer = play();
                    if (!answer)
                        System.out.println(i+1 + ") Play "+ answer + " => Eat");
                    else System.out.println(i+1 + ") Play "+ answer);
                    break;
                }
                case(1): {
                    var answer = sleep();
                    if (!answer)
                        System.out.println(i+1 + ") Sleep "+ answer + " => Eat");
                    else System.out.println(i+1 + ") Sleep "+ answer);
                    break;
                }
                case(2): {
                    var answer = chaseMouse();
                    if (!answer)
                        System.out.println(i+1 + ") Chase Mouse "+ answer + " => Eat");
                    else System.out.println(i+1 + ") Chase Mouse "+ answer);
                    break;
                }
                case(3): {
                    var answer = say();
                    if (!answer)
                        System.out.println(i+1 + ") Say "+ answer + " => Eat");
                    else System.out.println(i+1 + ") Say "+ answer);
                    break;
                }
                case(4): {
                    var answer = eat();
                    if (!answer)
                        System.out.println(i+1 + ") Eat "+ answer + " => Eat");
                    else System.out.println(i+1 + ") Eat "+ answer);
                    break;
                }
            }
        }
    }
    boolean play(){
        if(Satiety <= 0) {
            eat(2);
            return false;
        }
        Satiety-=2;
        return true;
    }
    boolean sleep(){
        if(Satiety <= 0) {
            eat(2, Eat.fish);
            return false;
        }
        Satiety--;
        return true;
    }
    boolean chaseMouse(){
        if(Satiety <= 0) {
            eat(1, Eat.milk);
            return false;
        }
        Satiety -= 3;
        return true;
    }
    boolean say(){
        if(Satiety <= 0) {
            eat(3);
            return false;
        }
        Satiety--;
        return true;
    }
    boolean eat(){
        var rnd = new Random();
        Satiety += rnd.nextInt(3);
        return true;
    }
    boolean eat(int levelSatiety){
        Satiety += levelSatiety;
        return true;
    }
    boolean eat(int satiety, Eat eat){
        if (eat == Eat.meat) Satiety += satiety+2;
        else if (eat == Eat.fish) Satiety += satiety+3;
        else if (eat == Eat.milk) Satiety += satiety;
        else if (eat == Eat.soup) Satiety += satiety+2;
        return true;
    }
}
