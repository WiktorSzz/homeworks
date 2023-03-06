package pl.kurs.homeworks.lessonobjectclass.service;

import pl.kurs.homeworks.lessonobjectclass.model.Car;

import java.util.Arrays;

public class CarWarehouse {
    private Car[] array;
    private int carCounter;

    public CarWarehouse(int capacity) {
        this.array = new Car[capacity];
    }

    public void addCar(Car car) {
        if (car == null) {
            System.out.println("Nie dodano żadnego pojazdu!");
        } else if (carCounter == array.length) {
            System.out.println("Magazyn jest pełny!");
        } else {
            array[carCounter++] = car;
            System.out.println("Do magazynu dodano samochód: " + car);
        }
    }

    public void searchCar(Car car) {
        if (car == null) {
            System.out.println("Proszę wskazać pojazd!");
        } else {
            int equalCars = 0;
            for (int i = 0; i < carCounter; i++) {
                if (car.equals(array[i])) {
                    equalCars++;
                }
            }
            System.out.println("Wyszukiwany samochód to: " + car + " ,w magazynie znajduje się: " + equalCars + " samochodów o identycznych parametrach.");
        }
    }

    public void differentCars(Car car) {
        if (car == null) {
            System.out.println("Proszę wprowadzić dane pojazdu!");
        } else {
            int differentCars = 0;
            for (int i = 0; i < carCounter; i++) {
                if (car.hashCode() != array[i].hashCode()) {
                    differentCars++;
                }
            }
            System.out.println("W magazynie znajduje się: " + differentCars + " różniących się pojazdów od wyszukiwanego samochodu: " + car + ".");
        }
    }


    public Car[] getCars() {//getter nie łamiący zasad hermetyzacji
        Car[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                copiedArray[i] = new Car(array[i]);
        }
        return copiedArray;
    }

}
