package ru.javalang.module11.tasks.t01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int z = 0;
        String d;
        while ((d=n.readLine())!=null)
            {int b = Integer.parseInt(d);
        z += b;}

        out.println(z);
        out.flush();


    }
}
