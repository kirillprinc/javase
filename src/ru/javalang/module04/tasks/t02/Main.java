package ru.javalang.module04.tasks.t02;

import java.util.Scanner;

/**
 * Выведите на экран сумму четных элементов массива.
 *
 *  Если в массиве нет четных элементов, выведите "NO".
 *
 *  Например:
 *
 *  Input	        Result
 *  6
 *  1 2 3 4 5 6	    12
 *  5
 *  9 7 5 3 1	    NO
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mas = new int[n];
        int sum = 0;

        for (int i=0; i<n; i++)
            {
                System.out.println("Введите элемент массива: ");
                mas[i] = scan.nextInt();
                if (mas[i] % 2 == 0) {
                    sum = sum + mas[i];
                    }
            }
            if (sum==0)
            {System.out.println("NO");}
            else {
                System.out.println("Сумма четных элементов ровна " + sum);}

        }
    }
