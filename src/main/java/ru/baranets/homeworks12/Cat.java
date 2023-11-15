package ru.baranets.homeworks12;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.getThereIsFood() < appetite && plate.getThereIsFood() > 0) {
            System.out.println(name + " не доволен, слишком мало еды ;(");
            satiety = false;
            return;
        }
        System.out.println(name + " поел");
        plate.take(appetite);
        satiety = true;
    }

    public void info() {
        if (satiety) {
            System.out.println(name + " сыт и доволен");
        } else {
            System.out.println(name + " хочет есть");
        }
    }
}
