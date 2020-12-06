package com.company;

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
        for(var i = 0; i< 24; i++) {
            switch ((int)(Math.random() * 5)) {
                case(0): play();
                case(1): sleep();
                case(2): chaseMouse();
                case(3): say();
                case(4): eat();
            }
        }
    }
    boolean play(){
        if(Satiety <= 0)
            return false;
        return true;
    }
    boolean sleep(){
        if(Satiety <= 0)
            return false;
        return true;
    }
    boolean chaseMouse(){
        if(Satiety <= 0)
            return false;
        return true;
    }
    boolean say(){
        if(Satiety <= 0)
            return false;
        return true;
    }
    boolean eat(){
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
