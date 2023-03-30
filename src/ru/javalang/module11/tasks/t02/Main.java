package ru.javalang.module11.tasks.t02;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int r = 0;
        int[] values = new int[5];
        BufferedReader in = new BufferedReader(new
                FileReader("C:\\study\\module11t2.txt"));
        FileWriter write = new FileWriter("C:\\study\\module11t02.txt");
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(in.readLine());
        r+= values[i];
        }
        write.write(r);
        in.close();
        System.out.println("Rezultat: " + r);

    }

}
