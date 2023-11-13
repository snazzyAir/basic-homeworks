package ru.baranets.homeworks11.animals;

import ru.baranets.homeworks11.Animal.Animal;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, stamina);
    }

    public int swim(int distance) {
        System.out.println("коты не умеют плавать");
        return time = -1;
    }
}
