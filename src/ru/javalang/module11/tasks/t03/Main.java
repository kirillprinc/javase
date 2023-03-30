package ru.javalang.module11.tasks.t03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.firstName="POP";
        user.age=25;

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\study\\User.ser")))
        {out.writeObject(user);}
        catch (IOException e){System.out.println("Ошибка: "+e.getMessage());}
    }
}
