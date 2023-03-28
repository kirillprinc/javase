package ru.javalang.module02.tasks.t02;

import java.util.Scanner;

/**
 *
 * С клавиатуры вводится двузначное натуральное число.
 * Вывести на экран количество десятков в нем.
 *
 * For example:
 * Например:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    45      |   4       |
 * --------------------------
 */

public class Main {
    public static void main(String[] args) {

        // Объявление и инициализация переменной 'in'
        Scanner in = new Scanner(System.in);

        System.out.print("Задача 2: Вывести на экран колличество десятков числа.\nВведите целое число: ");

        // Объявление и инициализация переменной 'x'
        int x = in.nextInt();

        // Объявление и инициализация переменной 'result'
        int result = x/10;

        // Вывод результата
        System.out.println("Колличество десятков " + x + " равен " + result);

    }
}