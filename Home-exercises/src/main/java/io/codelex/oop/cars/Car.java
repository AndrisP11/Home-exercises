package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String carName;
    private String model;
    private BigDecimal price;

    private int yearMade;
    List<Manufacturer> manufacturers1;
    EngineType engineType;

    public Car(String carName, String model, int yearMade, BigDecimal price, List<Manufacturer> manufacturer, EngineType engine) {

        this.carName = carName;
        this.model = model;
        this.yearMade = yearMade;
        this.price = price;
        this.engineType = engine;
        this.manufacturers1 = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(model, car.model) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carName, model, price);
    }

    public String getCarName() {
        return carName;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYearMade() {
        return yearMade;
    }

    public List<Manufacturer> getManufacturers1() {
        return manufacturers1;
    }

    public EngineType getEngineType() {
        return engineType;
    }


}
