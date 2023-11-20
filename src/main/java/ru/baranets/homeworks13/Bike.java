package ru.baranets.homeworks13;

public class Bike implements Transport {
    private final Human staminaHuman;
    private final int staminaConsumptionCoefficientPerMeter;

    public Bike(Human staminaHuman) {
        this.staminaHuman = staminaHuman;
        this.staminaConsumptionCoefficientPerMeter = 3;
    }

    @Override
    public boolean drive(int distance, Area location) {
        if (location == Area.SWAMP) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        if (staminaHuman.getStamina() >= staminaHuman.getStamina() - distance * staminaConsumptionCoefficientPerMeter) {
            int remainingStamina = staminaHuman.getStamina() - distance * staminaConsumptionCoefficientPerMeter;
            System.out.println("Велосипед проехал " + distance + " метров");
            return true;
        } else {
            System.out.println("не хватает сил для перемещения ");
            return false;
        }

    }
}
