package com.company;

public class Main {

    public static void main(String[] args) {
        var kit = new Kotik();
        kit.liveAnotherDay();
        kit.SetKotik(99, "Pom", 3000, "Meoooow");
        System.out.println("\nName: " + kit.getName() + " Weight: " + kit.getWeight());

        var kit2 = new Kotik(2);
        kit2.SetKotik(99, "Nat", 2000, "Mrrr");

        System.out.println("Сравнение meow: " + kit.getMeow().equals(kit2.getMeow()));

        System.out.println("Count: " + kit.getCount());
    }
}