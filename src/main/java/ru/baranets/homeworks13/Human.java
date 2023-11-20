package ru.baranets.homeworks13;

public class Human {
    private final String name;
    private Transport currentTransport;
    private int stamina;
    private final int staminaConsumptionCoefficientPerMeter;
    private boolean isSitingOnTransport;

    public Human(String name, int stamina) {
        this.name = name;
        this.currentTransport = null;
        this.stamina = stamina;
        this.staminaConsumptionCoefficientPerMeter = 5;
        this.isSitingOnTransport = false;
    }

    public boolean drive(Area location, int distance) {
        if (distance < 0) {
            System.out.println("Расстояние меньше нуля");
            return false;
        }
        if (currentTransport != null) {
            return currentTransport.drive(distance, location);
        }
        if (stamina > distance * staminaConsumptionCoefficientPerMeter) {
            stamina -= distance * staminaConsumptionCoefficientPerMeter;
            System.out.println(name + " Идет пешком " + distance + " метров");
            return true;
        } else {
            System.out.println("Не хватает сил для перемещения пешком");
            return false;
        }
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
