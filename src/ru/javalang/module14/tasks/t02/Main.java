package ru.javalang.module14.tasks.t02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Usert02> user = new ArrayList<>();

        user.add(new Usert02("Pavel", "Popovich", 25, "8-888-888-88-88"));
        user.add(new Usert02("Nikolai", "Nikolaevich", 22, "9-999-999-99-99"));
        user.add(new Usert02("Iotya", "Trusov", 19, "2-222-222-22-22"));
        user.add(new Usert02("Andrei", "Borzev", 15, "1-111-111-11-11"));


        Collections.sort(user, new Comparator<Usert02>() {
            @Override
            public int compare(Usert02 o1, Usert02 o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Usert02 usert02 : user)
            {
                System.out.println(usert02.getAge()+ " "+ usert02.getFirstName()+ " "+ usert02.getName()+ " "+usert02.getTelNamber());
            }
    }
}
