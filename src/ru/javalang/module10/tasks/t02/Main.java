package ru.javalang.module10.tasks.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try
        {
            FileInputStream test = new FileInputStream("C:\\study\\text.txt");
            while (test.available()>0){int t = test.read();
                System.out.println( (char) t + " ");}

        }
            catch (FileNotFoundException e)
                {
                    System.out.println("Voznikla problema: "+e);
                                    } catch (IOException e) {
            e.printStackTrace();
            }
    }
}
