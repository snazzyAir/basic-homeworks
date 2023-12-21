package ru.baranets.homeworks11.Animal;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;
    protected int time;

    public Animal(String name, int runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
    }

    public int run(int distance) {
        int time = 0;
        if (stamina < distance) {
            System.out.println(name + " устал(а)");
            return time = -1;
        }
        stamina -= distance;
        time = distance / runSpeed;
        System.out.println(name + " пробежал(а): " + distance + " метров за: " + time + " секунд.");
        return time;
    }

    public void info() {
        System.out.println(name + " - осталось " + stamina + " едениц выносливости.");
    }

    public int swim(int distance) {
        int time = 0;
        if (stamina < distance) {
            System.out.println(name + " устал(а)");
            return time = -1;
        }
        time = distance / swimSpeed;
        System.out.println(name + " проплыл(а): " + distance + " метров за: " + time + " секунд.");
        return time;
    }
}