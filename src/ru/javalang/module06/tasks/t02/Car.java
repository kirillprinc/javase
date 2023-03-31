package ru.javalang.module06.tasks.t02;

import java.time.Year;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car {
    public String catCar;
    public String Transmission;
    public String nomberCar;
    public int Yers;


    public Car(String catCar, String transmission, String nomberCar, int yers) {
        this.catCar = catCar;
        Transmission = transmission;
        this.nomberCar = nomberCar;
        this.Yers = yers;
    }

    public String getCatCar() {return catCar;}
    public  String getTransmission() {return Transmission;}
    public  String getNomberCar() {return  nomberCar;}
    public int getYers() {return Yers;}

}
