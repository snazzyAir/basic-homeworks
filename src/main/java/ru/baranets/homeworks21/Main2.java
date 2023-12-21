package ru.baranets.homeworks21;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100_000_000];
        long startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                for (int j = threadIndex * (array.length / 4); j < (threadIndex + 1) * (array.length / 4); j++) {
                    array[j] = 1.14 * Math.cos(j) * Math.sin(j * 0.2) * Math.cos(j / 1.2);
                }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Время выполнения цикла с 4 потоками: " + executionTime + " мс");
    }
}

