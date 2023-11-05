package ru.baranets.homeworks11.animals;

public class Cat extends Animal{
    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed,  stamina);
    }
    public void swim(int distance){
        System.out.println("коты не умеют плавать");

    }
}
