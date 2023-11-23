package ru.baranets.homeworks13;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Коля", 10000);
        Bike bike = new Bike(human);
        Car car = new Car();
        Horse horse = new Horse();
        AllTerrainVehicle allTerrainVehicle = new AllTerrainVehicle();

        human.drive(Area.PLAIN,600);
        human.info();
        human.setDrive(car);
        human.drive(Area.PLAIN,9000);
        human.setDrive(bike);



    }
}
