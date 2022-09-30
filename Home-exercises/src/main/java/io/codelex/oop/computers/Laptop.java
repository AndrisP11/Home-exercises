package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    String battery;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Pentium4", "DDR3", "Nvidia GTX 720", "Dell", "AT-453-BL", "Ion 342TH");

        System.out.println(laptop1.getProcessor());
        System.out.println(laptop1.getRam());
        laptop1.setRam("DDR4");
        System.out.println(laptop1.getGraphicsCard());
        System.out.println(laptop1);
    }

    @Override
    public String toString() {
        return "Laptop " +
                "battery='" + battery + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
