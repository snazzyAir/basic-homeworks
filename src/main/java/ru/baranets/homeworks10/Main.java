package ru.baranets.homeworks10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        User[] users = {
                new User("Petrov", "Aleksandr", "Aleksandrovich", 1980, "abc@mail.ru"),
                new User("Stepanov", "Petr", "Vasilevich", 1956, null),
                new User("Ivanov", "Ivan", "Ivanovich", 2000, "vanich@mail.ru"),
                new User("Ivanov", " Nikita", "Vasilevich", 2001, "cfr@mail.ru"),
                new User("Aliev", "Ali", "Alievich", 1977, "sham@mail.ru"),
                new User("Nedotepin", "Nikolay", "Alecksandovich", 1998, "koll@mail.ru"),
                new User("Petrov", "Karen", "Aleksandrovich", 1970, "kar@mail.ru"),
                new User("Metrov", "Maksim", "Aleksandrovich", 1991, "mac@mail.ru"),
                new User("Detrov", "Denis", "Aleksandrovich", 1989, "den@mail.ru"),
                new User("Vetrov", "Oleg", "Aleksandrovich", 1996, "oleg@mail.ru"),
        };
        for (int i = 0; i < users.length; i++) {
            if (2023 - users[i].getYearOfBirth() > 40) {
                users[i].info();
                System.out.println();
            }
        }
        Box box = new Box(5, 5, 5, "белый", true);
        box.info();
        box.open();
        box.put("подарок");
        box.getIt();
        box.repaint("черный");
        box.put("подарок");
    }
}
