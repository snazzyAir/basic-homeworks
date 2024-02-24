package ru.baranets.homeworks16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    public static void main(String[] args) {

        PhoneBook phBook = new PhoneBook();
        phBook.add("Иванов И.И", "551433");
        phBook.add("Петров П.П", "551544");
        phBook.add("Новиков Н.Н", "551655");
        phBook.add("Сидоров С.С", "551766");
        phBook.add("Козлов К.К", "551877");
        phBook.add("Козлов К.К", "551878");
        phBook.find("Иванов И.И");
        phBook.find("Киржаков О.Н");
        phBook.find("Козлов К.К");
        phBook.containsPhoneNumber("661544");
        phBook.containsPhoneNumber("551433");

    }

    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String fio, String phoneNumber) {
        Set<String> phoneNumbers = phoneBook.get(fio);
        if (phoneNumbers == null) {
            phoneNumbers = new HashSet<>();
            phoneBook.put(fio, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
        System.out.println(fio + " - " + phoneNumber);
    }

    public void find(String fio) {
        if (phoneBook.containsKey(fio)) {
            System.out.println(phoneBook.get(fio));
        } else {
            System.out.println("Данное ФИО  отсутствует в телефонной книге");
        }
    }

    public boolean containsPhoneNumber(String phoneNumber) {
        for (var entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                System.out.println(phoneNumber);
                return true;
            }
        }
        System.out.println("Данный номер: " + phoneNumber + "  отсутствует в телефонной книге");
        return false;
    }
}
