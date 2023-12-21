package ru.baranets.homeworks13;

public class Car implements Transport {
    private final int consumption;
    private int petrol;

    public Car() {
        this.consumption = 8;
        this.petrol = 50;
    }

    @Override
    public boolean drive(int distance, Area location) {
        if (location == Area.SWAMP && location == Area.DENSE_FOREST) {
            System.out.println("Машина ездит только по дороге");
            return false;
        }
        if ((distance * consumption) / 100000 < petrol) {
            petrol -= (consumption * distance) / 100000;
            System.out.println("Машина проехала: " + distance + " метров" + " Осталось: " + petrol + " литров бензина");
            return true;
        } else {
            System.out.println("Бензина не хватит");
            return false;
        }
    }
}

