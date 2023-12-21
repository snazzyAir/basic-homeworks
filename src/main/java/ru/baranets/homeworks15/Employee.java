package ru.baranets.homeworks15;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Петр", 24));
        list.add(new Employee("Иван", 27));
        list.add(new Employee("Генадий", 34));
        list.add(new Employee("Степан", 18));
        list.add(new Employee("Адександр", 35));
        list.add(new Employee("Дмитрий", 37));
        System.out.println(getName(list));
        System.out.println(getMinAge(list, 25));
        System.out.println(checkMinimumAverageAge(list, 18));
        System.out.println(getYoungEmp(list));
    }

    public String name;
    private final int age;

    public String toString() {
        return "Имя: " + name + " | Возраст: " + age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static List<String> getName(List<Employee> list) {
        List<String> names = new ArrayList<>(list.size());
        for (Employee employee : list) {
            names.add(employee.name);
        }
        return names;
    }

    public static List<Integer> getMinAge(List<Employee> list, int minAge) {
        List<Integer> ages = new ArrayList<>(list.size());
        for (Employee employee : list) {
            if (employee.age >= minAge) {
                ages.add(employee.age);
            }
        }
        return ages;
    }

    public static boolean checkMinimumAverageAge(List<Employee> list, int minimumAverageAge) {
        int sumAge = 0;
        for (Employee employee : list) {
            sumAge += employee.age;
        }
        int averageAge = sumAge / list.size();
        return averageAge > minimumAverageAge;
    }

    public static Employee getYoungEmp(List<Employee> list) {
        Employee youngEmployee = list.get(0);
        for (Employee employee : list) {
            if (employee.age < youngEmployee.age) {
                youngEmployee = employee;
            }
        }
        return youngEmployee;
    }
}


