package ru.test;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        Task 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
//        Task 2
        String needName = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + needName);
//        Task 3
        String fulName = "Иванов Семён Семёнович";
        fulName.replace("ё", "е");
        String[] words = fulName.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("ё")) {
                words[i].replace('ё', 'е');
            }
            System.out.println(words[i]);
        }
        System.out.println("Данные ФИО сотрудника - " + fulName);
    }
}
