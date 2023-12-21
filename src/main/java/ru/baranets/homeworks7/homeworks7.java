package ru.baranets.homeworks7;


import java.util.Arrays;

public class homeworks7 {

    public static void main(String[] args) {
        sumOfPositiveElements(new int[][]{{1, 5,}, {1, 1, 1, 1}});
        printSquare(5);
        diagonalSquare(new int[5][5]);
        findMax(new int[][]{{1, 2, 3, 4, 5, 6, 7}, {1, 2, 6, 7, 8, 9, 10}});
        sumSecondString(new int[][]{{1, 2, 3}, {5, 5, 5}});
    }

    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) sum += array[i][j];
            }
        }
        return;
    }

    public static void printSquare(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void diagonalSquare(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 1;
                if (j == i) {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void findMax(int[][] array) {
        int maxValue = array[0][0];
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array[j].length; i++) {
                if (array[j][i] > maxValue) {
                    maxValue = array[j][i];
                }
            }
        }
        return;
    }

    public static int sumSecondString(int[][] array) {
        if (array.length >= 2) {
            int str2 = 0;
            for (int i = 0; i < array[1].length; i++) {
                str2 += array[1][i];
            }
            return str2;
        } else {
            return -1;
        }
    }
}





