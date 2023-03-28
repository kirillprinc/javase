package ru.javalang.module03.tasks.t01;

import java.util.Scanner;

/**
 *
 * Ввести число, и выяснить -
 * положительное оно, отрицательное, или равно нулю?
 *
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1. Выяснить число положительное, отрицательное или ровно нулю. \nВведите число");

        int n = scanner.nextInt();

        if (n>0){
            System.out.println("Число положчтельное");
        } else if (n<0) {
            System.out.println("Число отрицательное");
                    }
        else {
            System.out.println("Число ровно 0");

    }
}
}
