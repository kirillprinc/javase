package ru.javalang.module03.tasks.t03;

import java.util.Scanner;

/**
 * Написать программу для проверки кратности числа X числу Y
 * (оба числа вводятся с клавиатуры).
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 3. Кратно ли вводимое число Х заданному Y.\nВведите число Х: ");
        int x = scanner.nextInt(); //Задаваемое число
        System.out.println("Введите число Y: ");
        int y = scanner.nextInt(); //Задаваемое число
        if (x%y !=0){
            System.out.println("Число " + x + " некратно " + y);
        } else {
            System.out.println("Число " + x + " кратно " + y);
        }

    }
}
