package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    private String name;
    private String sex;
    private String father;
    private String mother;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.father = "Unknown";
        this.mother = "Unknown";
    }

    public String fathersName() {
        return father;
    }

    public String getMother() {
        return mother;
    }

    public boolean hasSameMotherAs(String mother) {
        boolean b = this.mother.equals(mother);
        if (b && this.mother.equals("Unknown")) {
            b = false;
        }
        return b;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                '}';
    }
}
