package ru.baranets.homeworks11;

import ru.baranets.homeworks11.animals.Cat;
import ru.baranets.homeworks11.animals.Dog;
import ru.baranets.homeworks11.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Персик", 16, 1, 1000);
        Horse horse = new Horse("Плотва", 25, 1, 5000);
        Cat cat = new Cat("Ричи", 8, 500);

        dog.info();
        horse.swim(100);
        horse.info();
        dog.swim(100);
        dog.info();
        cat.swim(6);
        cat.run(300);
    }
}
