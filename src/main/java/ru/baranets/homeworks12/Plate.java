package ru.baranets.homeworks12;

public class Plate {
    private final int maxFood;
    private int thereIsFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.thereIsFood = maxFood;
    }

    public void fill(int food) {
        if (thereIsFood + food > maxFood) {
            System.out.println("В тарелке не хватает места");
            return;
        } else {
            thereIsFood += food;
            System.out.println("Положили " + food + " камушков");
            System.out.println("В тарелке лежит: " + thereIsFood + " камушков");
        }
    }

    public boolean take(int food) {
        if (thereIsFood >= food) {
            thereIsFood -= food;
            System.out.println("Забрали " + food + " камушков");
            System.out.println("В тарелке лежит: " + thereIsFood + " камушков");
            return true;
        } else {
            System.out.println("Тарелка пуста");
            return false;
        }
    }

    public int getThereIsFood() {
        return thereIsFood;
    }
}
