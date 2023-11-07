package ru.baranets.homeworks11.animals;

import ru.baranets.homeworks11.Animal.Animal;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
    }

    public void swim(int distance) {
        double time = 0;
        distance *= 4;
        if (stamina < distance) {
            time = -1;
            System.out.println(name + " устал(а)");
            return;
        }
        stamina -= distance;
        time = distance / swimSpeed;
        System.out.println(name + " проплыл(а): " + distance + " метров за: " + time + " секунд.");
    }
}
