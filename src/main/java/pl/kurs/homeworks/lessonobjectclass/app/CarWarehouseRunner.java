package pl.kurs.homeworks.lessonobjectclass.app;


import pl.kurs.homeworks.lessonobjectclass.model.Car;
import pl.kurs.homeworks.lessonobjectclass.service.CarWarehouse;

public class CarWarehouseRunner {
    public static void main(String[] args) {
        CarWarehouse carWarehouse = new CarWarehouse(10);

        Car car1 = new Car("Skoda", "Fabia");
        Car car2 = new Car("Audi", "a5");
        Car car3 = new Car("Bmw", "e30");
        Car car4 = new Car("Audi", "A7");
        Car car5 = new Car("Bmw", "X6");

        carWarehouse.addCar(car1);
        carWarehouse.addCar(car2);
        carWarehouse.addCar(car3);
        carWarehouse.addCar(car3);
        carWarehouse.addCar(car3);
        carWarehouse.addCar(car3);
        carWarehouse.addCar(car3);
        carWarehouse.addCar(car4);
        carWarehouse.addCar(car5);

        carWarehouse.searchCar(car3);
        carWarehouse.differentCars(car1);

        Car[] carsFromGetter = carWarehouse.getCars();
        carsFromGetter[0].setProducer("DUPAXD");

    }
}
