package ru.baranets.homeworks28;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String searchSequence = "abc";

        int occurrences = countCharacterSequence(fileName, searchSequence);
        System.out.println("Количество вхождений: " + occurrences);
    }

    public static int countCharacterSequence(String fileName, String searchSequence) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrences(line, searchSequence);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countOccurrences(String line, String searchSequence) {
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = line.indexOf(searchSequence, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += searchSequence.length();
            }
        }
        return count;
    }
}
