package ru.baranets.homeworks15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(minMax(1, 10));

        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(5);
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(10);
        arrayList1.add(0);
        System.out.println(fiveSum(arrayList1));

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(10);
        arrayList.add(0);
        censusCell(5, arrayList);

        increaseInNumber(10, arrayList1);
    }

    public static List<Integer> minMax(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    public static int fiveSum(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 5) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    public static void censusCell(int cell, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, cell);
        }
        System.out.println(list);
    }

    public static void increaseInNumber(int nextNumber, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + nextNumber);
        }
        System.out.println(list);
    }
}
