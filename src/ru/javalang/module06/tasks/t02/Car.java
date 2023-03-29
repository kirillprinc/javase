package ru.javalang.module06.tasks.t02;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car {
    public String catCar="B";
    public String Transmission="mechanical";
    public String nomberCar="B123JK34";
    public int massaCar=12;

    public Car(String catCar, String transmission, String nomberCar, int massaCar) {
        this.catCar = catCar;
        Transmission = transmission;
        this.nomberCar = nomberCar;
        this.massaCar = massaCar;


}
}
