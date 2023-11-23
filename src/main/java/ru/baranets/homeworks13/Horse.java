package ru.baranets.homeworks13;

public class Horse implements Transport {
    private int stamina;

    public Horse() {
        this.stamina = 10000;
    }

    @Override
    public boolean drive(int distance, Area location) {
        if (location == Area.SWAMP) {
            System.out.println("Лошадь не может скакать по болоту");
            return false;
        }
        if (stamina < distance) {
            System.out.println(" устал(а)");
            return false;
        }
        stamina -= distance / 2;
        System.out.println("Пройдено: " + distance + " метров" + " Осталось: " + stamina + " выносливости");
        return true;
    }

}
