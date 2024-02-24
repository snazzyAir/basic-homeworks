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

    public String getName() {
        return name;
    }

    public Transport getCurrentTransport() {
        return currentTransport;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStaminaConsumptionCoefficientPerMeter() {
        return staminaConsumptionCoefficientPerMeter;
    }

    public void setCurrentTransport(Transport currentTransport) {
        this.currentTransport = currentTransport;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setSitingOnTransport(boolean sitingOnTransport) {
        isSitingOnTransport = sitingOnTransport;
    }

    public boolean isSitingOnTransport() {
        return isSitingOnTransport;
    }

    public void info() {
        System.out.println("выносливость человека: " + stamina);

    }

    public void setDrive(Transport transport) {
        if (!isSitingOnTransport) {
            currentTransport = transport;
            System.out.println(name + " сел(а) в: " + transport);
        }else {
        }System.out.println(name + " сидит в " + transport);
    }
}
