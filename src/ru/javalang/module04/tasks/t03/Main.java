package ru.javalang.module04.tasks.t03;

import java.util.Scanner;

/**
 * Развернуть массив в обратную сторону ("задом наперед").
 *
 *  Последний элемент должен находится на месте начального и наоборот.
 *
 *  Не разрешается использовать дополнительный массив.
 *
 *  Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
 *
 *  For example:
 *
 *  Input	            Result
 *  6
 *  1 2 3 4 5 6	        6 5 4 3 2 1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кол-во элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mas = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("Введите элемент массива: ");
            mas[i] = scan.nextInt();
            }
        for (int i=0; i<n/2; i++)
        {int b = mas[i];
        mas[i]=mas[n-i-1];
        mas[n-i-1]=b;}

        for (int i=0; i<n; i++)
        {
            System.out.println("Было: " + (i+1) + " Стало " + mas[i]);
                    }

    }

}
