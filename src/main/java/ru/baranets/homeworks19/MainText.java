package ru.baranets.homeworks19;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainText {
    public class TextFileApp {
        public static void main(String[] args) {
            String rootDirectory = System.getProperty("user.dir");
            File rootFolder = new File(rootDirectory);
            File[] files = rootFolder.listFiles();
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println(file.getName());
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя файла: ");
            String fileName = scanner.nextLine();

            // Открываем файл и выводим его содержимое в консоль
            File targetFile = new File(rootDirectory, fileName);
            try (Scanner fileScanner = new Scanner(targetFile)) {
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }
            System.out.print("Введите текст: ");
            String userText = scanner.nextLine();
            try (FileWriter writer = new FileWriter(targetFile, true)) {
                writer.write(userText + "\n");
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }

            scanner.close();
        }
    }
}
