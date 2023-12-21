package ru.baranets.homeworks11.animals;

import ru.baranets.homeworks11.Animal.Animal;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, stamina);
        this.swimSpeed = swimSpeed;
    }

    public int swim(int distance) {
        int time = 0;
        if (stamina < distance) {
            System.out.println(name + " устал(а)");
            return time = -1;
        }
        stamina -= distance * 4;
        time = distance / swimSpeed;
        System.out.println(name + " проплыл(а): " + distance + " метров за: " + time + " секунд.");
        return time;
    }
}
