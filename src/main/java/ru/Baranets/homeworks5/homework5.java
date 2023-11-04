package ru.baranets.homeworks5;


import java.util.Arrays;

public class homework5 {
    public static void main(String[] args) {
        m1(6, "Lessen");
        m2();
        m3(8, new int[10]);
        m4(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        m5(new int[]{1, 1, 1, 1, 1, 5, 5, 5, 5, 5});
    }

    public static void m1(int a, String str) {

        for (int i = 1; i <= a; i++) {
            System.out.println(str + " " + i);
        }
    }

    public static void m2() {
        int[] fiveApp = {1, 7, 1, 10, 3, 120, 33};
        int sum = 0;
        for (int i = 0; i < fiveApp.length; i++) {
            if (fiveApp[i] > 5) {
                sum += fiveApp[i];
            }
        }
        System.out.println(Arrays.toString(fiveApp));
        System.out.println(sum);
    }

    public static void m3(int a, int[] g) {

        for (int i = 0; i < g.length; i++) {
            g[i] = a;
        }
        Arrays.fill(g, a);
        System.out.println(Arrays.toString(g));
    }

    public static void m4(int a, int[] g) {

        for (int i = 0; i < g.length; i++) {
            g[i] += a;
        }
        System.out.println(Arrays.toString(g));
    }

    public static void m5(int[] h) {
        int sum = 0;
        for (int i = 0; i < h.length / 2; i++) {
            sum += h[i];
        }
        int sum2 = 0;
        for (int i = h.length / 2; i < h.length; i++) {
            sum2 += h[i];
        }
        if (sum > sum2) {
            System.out.println("Первая половина больше");
        } else {
            System.out.println("Вторая половина больше");
        }
    }
}








