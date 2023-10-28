package ru.baranets;


import java.util.Arrays;

public class homeworks7 {


    public static void main(String[] args) {
        sumOfPositiveElements(new int[][]{{1, 5, -10, 0}, {1, 2, 0, -8}});
        printSquare(5);
        diagonalSquare(new int[5][5]);
        findMax(new int[][]{{1, 2, 3, 4, 5, 6, 7}, {1, 2, 6, 7, 8, 9, 1}});
        sumSecondString(new int[][]{{1, 2, 3}, {5, 5, 5}});


    }

    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }

            }

        }
        System.out.println(sum);


    }

    public static void printSquare(int size) {


        char[][] array = new char[size][size];

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                array[x][y] = '*';
                System.out.print(array[x][y] + "  ");

            }
            System.out.println();

        }
        System.out.println();


    }

    public static void diagonalSquare(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                array[x][y] = 1;
                if (y == x) {
                    array[x][y] = 0;
                }
                if (y + x == array.length - 1) {
                    array[x][y] = 0;
                }

                System.out.print(array[x][y] + "  ");

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
        System.out.println(maxValue);

    }

    public static void sumSecondString(int[][] array) {
        if (array.length >= 2) {
            int str2 = 0;
            for (int i = 0; i < array[1].length; i++) {
                str2 += array[1][i];
            }
            System.out.println(str2);


        } else {
            System.out.println(-1);
        }


    }

}





