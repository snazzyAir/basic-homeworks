package ru.baranets.homeworks3;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5");

        while (true) {

            int result = scanner.nextInt();

            int rnd = (int) (Math.random() * 30);

            boolean b = Math.random() > 0;

            if (result < 1 || result > 5) {
                System.out.println("Введено неправильное число");
                System.out.println("Конец програмы");
                break;

            } else {
                System.out.println("Запускается метод №" + result);

            }


            if (result == 1) {
                greetings();
            }
            if (result == 2) {
                checkSign(rnd, rnd, rnd);
            }
            if (result == 3) {
                selectColor(rnd);
            }
            if (result == 4) {
                compareNumbers(rnd, rnd);
            }
            if (result == 5) {
                addOrSubtractAndPrint(rnd, rnd, b);
            }

        }

    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        }
        if (sum < 0) {
            System.out.println("Сумма отрицательна");
        }

    }

    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("желтый");
        }
        if (data > 20) {
            System.out.println("зеленый");
        }

    }

    public static void compareNumbers(int d, int e) {
        if (d >= e) {
            System.out.println("a >= b");
        }
        if (d < e) {
            System.out.println("a < b");
        }

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int sum = initValue + delta;
        int diff = initValue - delta;
        if (increment) {
            System.out.println(sum);
        } else {
            System.out.println(diff);
        }

    }

}
