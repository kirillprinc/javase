package ru.javalang.module03.tasks.t04;

import java.util.Scanner;

/**
 * Показать модуль введённого числа.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 4. Вывести модуль введенного значения.\nВведите число Х: ");
        int x = scanner.nextInt(); //Задаваемое число
        System.out.println("Модуль числа " + x + " равен " + Math.abs(x));//Вывод и возврат модуля числа

    }
}
