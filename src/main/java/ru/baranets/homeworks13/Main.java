package ru.baranets.homeworks13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Коля", 1000);
        Bike bike = new Bike(human);
        Car car = new Car();
        Horse horse = new Horse();
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle();
        human.drive(Area.PLAIN, 20);
        human.setCurrentTransport(bike);
        human.drive(Area.PLAIN, 20);
        human.setCurrentTransport(null);
        human.drive(Area.PLAIN, 20);
        human.setCurrentTransport(car);
        human.drive(Area.PLAIN, 30000);
        human.setCurrentTransport(null);
        human.setCurrentTransport(allTerrainVehicle);
        human.drive(Area.SWAMP, 200000);
        human.setCurrentTransport(null);
        human.setCurrentTransport(horse);
        human.drive(Area.SWAMP, 600);
        human.drive(Area.DENSE_FOREST, 10000);


    }
}
