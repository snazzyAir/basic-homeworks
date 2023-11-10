package ru.baranets.homeworks12;

public class Plate {
    private int maxFood;
    protected int thereIsFood;
    private int food;

    public Plate(int maxFood, int thereIsFood) {
        this.maxFood = maxFood;
        this.thereIsFood = thereIsFood;
    }

    public void fill(int food) {
        thereIsFood += food;
        if (thereIsFood > maxFood) {
            System.out.println("В тарелке нет места");
            return ;
        }
        else {
            System.out.println("Положили " + food + " камушков");
            System.out.println("В тарелке лежит: " + thereIsFood + " камушков");
        }

    }
    public boolean take(int food) {
        thereIsFood -= food;
        if(thereIsFood>=0) {
            return true;
        }
        else {
            System.out.println("Тарелка пуста");
            return false;
        }

    }

}
