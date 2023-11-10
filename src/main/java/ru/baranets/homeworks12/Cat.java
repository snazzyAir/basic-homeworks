package ru.baranets.homeworks12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        if (plate.thereIsFood < appetite) {
            System.out.println(name + " не доволен, слишком мало еды ;(");
            satiety = false;
            return;
        }
        System.out.println(name + " поел");
        plate.take(appetite);
        satiety = true;

    }

    public void info() {
        if (satiety = true) {
            System.out.println(name + " сыт и доволен");
        } else {
            System.out.println(name + " хочет есть");
        }
    }
}
