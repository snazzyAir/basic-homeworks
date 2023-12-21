package ru.baranets.homeworks12;

public class CatEatApp {
    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat[] cat = {
                new Cat("Барсик", 10),
                new Cat("Пух", 20),
                new Cat("Ричи", 15)
        };
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].info();
        }
    }
}
