package pl.kurs.homeworks.lessonobjectclass.model;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    static final long serialVersionUID = 1L;
    private String producer;
    private String model;

    public Car() {
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car(Car carForCopy) {// Konstruktor klonujący.
        this.producer = carForCopy.producer;
        this.model = carForCopy.model;
    }



    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
