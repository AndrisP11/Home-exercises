package io.codelex.polymorphism.practice.exercise3;

public class Person {
    private String firstname;
    private String lastname;
    private String address;
    final private int id;

    public Person(String firstname, String lastname, String address, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Persons name: " + this.firstname);
        System.out.println("Persons surname: " + this.lastname);
        System.out.println("Persons address: " + this.address);
        System.out.println("Persons id: " + this.id);
    }
}
