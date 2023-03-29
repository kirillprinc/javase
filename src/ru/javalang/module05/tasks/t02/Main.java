package ru.javalang.module05.tasks.t02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Используя форматирование времени и даты примените шаблон вывода:
 *
 * 2022-01-15 20:22:33
 *
 */
public class Main {
    public static void main(String[] args) {

        String Date = "yyyy-MM-dd HH:mm:ss";

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt.format(DateTimeFormatter.ofPattern(Date)));

    }
}
