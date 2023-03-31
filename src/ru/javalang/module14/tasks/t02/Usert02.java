package ru.javalang.module14.tasks.t02;

public class Usert02 {
    public String Name;
    public String FirstName;
    public int age;
    public String TelNamber;

    public Usert02(String name, String firstName, int age, String telNamber) {
        Name = name;
        FirstName = firstName;
        this.age = age;
        TelNamber = telNamber;
    }

    public String getName() {return Name;}
    public String getFirstName() {return FirstName;}
    public int getAge() {return age;}
    public String getTelNamber() {return TelNamber;}
}
