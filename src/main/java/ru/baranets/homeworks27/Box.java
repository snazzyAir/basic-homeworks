package ru.baranets.homeworks27;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    public Box() {
        fruits = new ArrayList<>();
    }
    public void addFruits(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0.0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void transferFruits(Box<T> otherBox) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
