package ru.javalang.module10.tasks.t01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int z=0; //Переменная для результата
        System.out.println("Vvedite delimoe chislo:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println("Vvedite delitel: ");
        int b = scan.nextInt();

        try
            {z=n/b;
            } catch (ArithmeticException e)
                {
                    System.out.println("Chislo b rovno 0, delit na 0 nelzya");
                                    }
        if (b!=0){System.out.println("Rezultat deleniya raven: "+z);}
        System.out.println("Programma vipolnena!");
    }
}
