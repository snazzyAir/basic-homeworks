package ru.baranets.homeworks11.animals;

import ru.baranets.homeworks11.Animal.Animal;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
    }

    public void swim(int distance) {
        double time = 0;
        distance *= 2;
        if (stamina < distance) {
            System.out.println(name + " устал(а)");
            time = -1;
            return;
        }
        stamina -= distance;
        time = distance / swimSpeed;
        System.out.println(name + " проплыл(а): " + distance + " метров за: " + time + " секунд.");
    }
}
