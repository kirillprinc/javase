package ru.javalang.module06.tasks.t01;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName="Попов";
        person1.lastName="Павел";
        person1.age=25;
        person1.phoneNamber="0-000-000-00-00";
        person1.cetRights="B";
        person1.modelCar="BMW X5M";
        person1.nomberCar="А111АА34";

        Person person2 = new Person();
        person2.firstName="Мефодьевич";
        person2.lastName="Мефодий";
        person2.age=20;

        System.out.println("Фамилия: "+ person1.firstName + "\nИмя: " + person1.lastName + "\nкатегория прав: "+ person1.cetRights);

    }
}
