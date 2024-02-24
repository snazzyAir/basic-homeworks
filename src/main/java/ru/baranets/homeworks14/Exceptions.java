package ru.baranets.homeworks14;

public class Exceptions {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3","7" }, {"2", "2", "z", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = stringExceptionTest(arr);
                System.out.println(result);
            } catch (AppArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (AppArrayDataException e) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + e.getMessage());
        }

    }
    public static int stringExceptionTest(String[][] arr)
            throws AppArraySizeException, AppArrayDataException {

        int sum = 0;
        if (4 != arr.length) throw new AppArraySizeException("Размер массива должен быть 4*4");
        for (int i = 0; i < arr.length; i++) {
            if (4 != arr[i].length) throw new AppArraySizeException("Размер массива должен быть 4*4");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
   static class AppArraySizeException extends Exception {
        public AppArraySizeException(String message) {
            super();
        }
    }
    static class AppArrayDataException extends Exception {
        AppArrayDataException(int row, int col) {
            super(String.format("Неверные данные находятся в ячейке ", row, col));
        }
    }
}

