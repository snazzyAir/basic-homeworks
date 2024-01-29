package ru.baranets.homeworks29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new PrintTask('A', 5));
        executor.execute(new PrintTask('B', 5));
        executor.execute(new PrintTask('C', 5));

        executor.shutdown();
    }
}

class PrintTask implements Runnable {
    private static Object lock = new Object();
    private static char currentChar = 'A';
    private char charToPrint;
    private int times;

    public PrintTask(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            synchronized (lock) {
                while (charToPrint != currentChar) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(charToPrint);
                if (currentChar == 'C') {
                    currentChar = 'A';
                } else {
                    currentChar++;
                }
                lock.notifyAll();
            }
        }
    }
}
