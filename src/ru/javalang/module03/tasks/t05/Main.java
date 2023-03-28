package ru.javalang.module03.tasks.t05;

import java.util.Scanner;

/**
 * Вводится целое число (не более 4 разрядов!).
 * Определить количество цифр в нём.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 5. Определить кол-во цифр в числе (число не более 4 разрядов).\nВведите число : ");
        int x = scanner.nextInt(); //Задаваемое число
        var y = String.valueOf(x).length();
        if (y>4){
            System.out.println("Число больше 4 разрядов.");
        } else {
            System.out.println("Колличество символов равно "+ y);}

    }
}
