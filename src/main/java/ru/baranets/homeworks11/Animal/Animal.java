package ru.baranets.homeworks11.Animal;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.stamina = stamina;
    }

    public void run(int distance) {
        double time = 0;
        if (stamina < distance) {
            time = -1;
            System.out.println(name + " устал(а)");
            return;
        }
        stamina -= distance;
        time = distance / runSpeed;
        System.out.println(name + " пробежал(а): " + distance + " метров за: " + time + " секунд.");
        return;
    }

    public void info() {
        System.out.println(name + " - осталось " + stamina + " едениц выносливости.");
    }

    public void swim(int distance) {
        double time = 0;
        if (stamina < distance) {
            System.out.println(name + " устал(а)");
            time = -1;
            time = distance / swimSpeed;
            System.out.println(name + " проплыл(а): " + distance + " метров за: " + time + " секунд.");
            return;

        }
    }
}
