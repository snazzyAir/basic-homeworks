package ru.baranets.homeworks13;

public class AllTerrainVehicle implements Transport {
    private final int consumption;
    private int petrol;

    public AllTerrainVehicle() {
        this.consumption = 5;
        this.petrol = 30;
    }

    @Override
    public boolean drive(int distance, Area location) {
        if ((distance * consumption) / 100000 < petrol) {
            petrol -= (consumption * distance) / 100000;
            System.out.println("Вездеход проехал: " + distance + " метров" + " Осталось: " + petrol + " литров бензина");
            return true;
        }
        System.out.println("Бензина не хватит");
        return false;
    }
}
