package ru.javalang.module03.tasks.t02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры число и проверить,
 * принадлежит ли это число диапазону от N до M (включительно).
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задача 2: Принадлежит ли вводимое число заданному диапазону.\nВведите число: ");
        int n = scanner.nextInt(); //Задаваемое число
        System.out.println("Введите значение начала диапазона: ");
        int g = scanner.nextInt();//Начало диапазона
        System.out.println("Введите значение конца диапазона: ");
        int h = scanner.nextInt();//Начало диапазона
        if (n>=g & n<=h) {
            System.out.println("Значение принадлежит диапазону");
        } else {
            System.out.println("Значение не принадлежит диапазону");

    }
}}
