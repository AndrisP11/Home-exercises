package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        CarService service = new CarService();
        Test test = new Test();
        test.inputTenCarsInCarsList(service);
        CarService.displayCarList(service.getCars());

        boolean isTrue2 = false;
        while (!isTrue2) {
            Scanner key = new Scanner(System.in);
            System.out.println("Please input your command.");
            System.out.println("1 to add new car to cars list ");
            System.out.println("2 to remove car from cars list ");
            System.out.println("3 to display cars in cars list ");
            System.out.println("4 to display cars only with selected engine ");
            System.out.println("5 to display only cars produced before selected year ");
            System.out.println("6 to display only most expensive car ");
            System.out.println("7 to display cheapest car ");
            System.out.println("8 to display cars with at least selected manufacturers ");
            System.out.println("9 to display ascending or descending cars list by car name, from user input ");
            System.out.println("10 to display specific car from the list ");
            System.out.println("11 to display a list of cars by a specific manufacturer ");
            System.out.println("12 to display list of cars from specific manufacturer. User inputs year with which to compare to year of cars production, if true puts in the list ");
            System.out.println("0 to quit ");
            System.out.println();
            String text = key.nextLine();

            switch (text) {
                case "1":
                    service.addCarToList(service.getCars(), CarService.manualAddCarToList());
                    CarService.displayCarList(service.getCars());
                    break;
                case "2":
                    System.out.print("Please input car name: ");
                    String carName2 = key.nextLine();
                    service.setCars(CarService.removeCarFromList(service.getCars(), carName2));
                    CarService.displayCarList(service.getCars());
                    break;
                case "3":
                    CarService.displayCarList(service.getCars());
                    break;
                case "4":
                    System.out.println("Please choose car engine from V12, V8, V6, S6, S4, S3");
                    System.out.print("Please input car engine: ");
                    String carEngine = key.nextLine();
                    List<Car> carsV12 = CarService.findCarsByEngineType(service.getCars(), EngineType.valueOf(carEngine));
                    if (carsV12.size() == 0) {
                        System.out.println("Have not found any cars.");
                        System.out.println();
                    } else {
                        CarService.displayCarList(carsV12);
                    }
                    break;
                case "5":
                    System.out.print("Please input year car was made: ");
                    int year = key.nextInt();
                    key.nextLine();
                    List<Car> carsBefore = CarService.carsBeforeYear(service.getCars(), year);
                    if (carsBefore.size() == 0) {
                        System.out.println("Have not found any cars.");
                        System.out.println();
                    } else {
                        CarService.displayCarList(carsBefore);
                    }
                    break;
                case "6":
                    List<Car> carsMaxCost = CarService.carsMaxCost(service.getCars());
                    CarService.displayCarList(carsMaxCost);
                    break;
                case "7":
                    List<Car> carsMinCost = CarService.carsMinCost(service.getCars());
                    CarService.displayCarList(carsMinCost);
                    break;
                case "8":
                    System.out.print("Please select how many car manufacturers car at least has to have: ");
                    int count = key.nextInt();
                    key.nextLine();
                    List<Car> carsWithManu = CarService.carsWithThreeManufacturers(service.getCars(), count);
                    if (carsWithManu.size() == 0) {
                        System.out.println("Have not found any cars.");
                        System.out.println();
                    } else {
                        CarService.displayCarList(carsWithManu);
                    }
                    break;
                case "9":
                    List<Car> carsAscendingName = CarService.carsAscendingName(service.getCars());
                    CarService.displayCarList(carsAscendingName);
                    break;
                case "10":
                    System.out.print("Please input car name: ");
                    String carName3 = key.nextLine();
                    List<Car> carsFindCar = CarService.carsFindCar(service.getCars(), carName3);
                    CarService.displayCarList(carsFindCar);
                    break;
                case "11":
                    System.out.print("Please input car manufacturer name: ");
                    String manuName2 = key.nextLine();
                    List<Car> findByManufacturer = CarService.findByManufacturer(service.getCars(), manuName2);
                    CarService.displayCarList(findByManufacturer);
                    break;
                case "12":
                    List<Car> carsFindManuYear = CarService.carsFindManuYear(service.getCars());
                    CarService.displayCarList(carsFindManuYear);
                    break;
                case "0":
                    isTrue2 = true;
                    break;
            }
        }
    }

    public void inputTenCarsInCarsList(CarService service) {
        List<Manufacturer> forCar1 = new ArrayList<>();
        List<Manufacturer> forCar2 = new ArrayList<>();
        List<Manufacturer> forCar3 = new ArrayList<>();
        List<Manufacturer> forCar4 = new ArrayList<>();
        List<Manufacturer> forCar5 = new ArrayList<>();
        List<Manufacturer> forCar6 = new ArrayList<>();
        List<Manufacturer> forCar7 = new ArrayList<>();
        List<Manufacturer> forCar8 = new ArrayList<>();
        List<Manufacturer> forCar9 = new ArrayList<>();
        List<Manufacturer> forCar10 = new ArrayList<>();

        Manufacturer manufacturer = new Manufacturer("Chevrolet", 1911, "U.S.");
        Manufacturer manufacturer2 = new Manufacturer("Nissan", 1933, "Japan");
        Manufacturer manufacturer3 = new Manufacturer("Honda", 1948, "Japan");
        Manufacturer manufacturer4 = new Manufacturer("Ford", 1903, "U.S.");
        Manufacturer manufacturer5 = new Manufacturer("Fiat", 1899, "Italy");
        Manufacturer manufacturer6 = new Manufacturer("Jeep", 1943, "U.S.");
        Manufacturer manufacturer7 = new Manufacturer("Volkswagen", 1937, "Germany");
        Manufacturer manufacturer8 = new Manufacturer("Volvo", 1927, "Sweden");
        Manufacturer manufacturer9 = new Manufacturer("Jaguar", 1922, "U.K.");
        Manufacturer manufacturer10 = new Manufacturer("Audi", 1909, "Germany");
        Manufacturer manufacturer11 = new Manufacturer("Toyota", 1937, "Japan");
        Manufacturer manufacturer12 = new Manufacturer("Land Rover", 1978, "U.K.");
        Manufacturer manufacturer13 = new Manufacturer("Lexus", 1989, "Japan");
        Manufacturer manufacturer14 = new Manufacturer("Porsche", 1931, "Germany");
        Manufacturer manufacturer15 = new Manufacturer("Bugatti", 1909, "France");
        Manufacturer manufacturer16 = new Manufacturer("Bentley", 1919, "U.K.");
        Manufacturer manufacturer17 = new Manufacturer("Rolls Royce", 1904, "U.K.");
        Manufacturer manufacturer18 = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer manufacturer19 = new Manufacturer("Tesla", 2003, "U.S.");
        Manufacturer manufacturer20 = new Manufacturer("Mercedes-Benz", 1926, "Germany");
        forCar1.add(manufacturer);
        forCar1.add(manufacturer2);

        forCar2.add(manufacturer4);
        forCar2.add(manufacturer5);
        forCar2.add(manufacturer6);

        forCar3.add(manufacturer3);
        forCar3.add(manufacturer9);

        forCar4.add(manufacturer7);
        forCar4.add(manufacturer8);
        forCar4.add(manufacturer18);
        forCar4.add(manufacturer10);
        forCar4.add(manufacturer11);

        forCar5.add(manufacturer12);

        forCar6.add(manufacturer13);
        forCar6.add(manufacturer14);

        forCar7.add(manufacturer9);
        forCar7.add(manufacturer17);

        forCar8.add(manufacturer19);

        forCar9.add(manufacturer4);
        forCar9.add(manufacturer16);

        forCar10.add(manufacturer15);
        forCar10.add(manufacturer20);

        Car car1 = new Car("Sting Ray Coupe", "Corvette", 1963, BigDecimal.valueOf(70561), forCar1, EngineType.S4);
        Car car2 = new Car("Acura", "NSX", 1990, BigDecimal.valueOf(165061), forCar2, EngineType.V12);
        Car car3 = new Car("Jaguar", "E-Type", 1961, BigDecimal.valueOf(110031), forCar3, EngineType.V12);
        Car car4 = new Car("Miata", "MX-5", 1989, BigDecimal.valueOf(23561), forCar4, EngineType.V6);
        Car car5 = new Car("Volvo", "P1800", 1961, BigDecimal.valueOf(130060), forCar5, EngineType.S6);
        Car car6 = new Car("Pontiac", "GTO", 1967, BigDecimal.valueOf(160000), forCar6, EngineType.V8);
        Car car7 = new Car("Vignale Spyder", "3500 GT", 1954, BigDecimal.valueOf(89031), forCar7, EngineType.V6);
        Car car8 = new Car("Skyline", "GTR r34", 1969, BigDecimal.valueOf(23561), forCar8, EngineType.V12);
        Car car9 = new Car("Mercedes-Benz", "300 SL", 1954, BigDecimal.valueOf(54561), forCar9, EngineType.S3);
        Car car10 = new Car("Atlantic", "Type 57SC", 1936, BigDecimal.valueOf(100200), forCar10, EngineType.S3);

        service.addCarToList(service.getCars(), car1);
        service.addCarToList(service.getCars(), car2);
        service.addCarToList(service.getCars(), car3);
        service.addCarToList(service.getCars(), car4);
        service.addCarToList(service.getCars(), car5);
        service.addCarToList(service.getCars(), car6);
        service.addCarToList(service.getCars(), car7);
        service.addCarToList(service.getCars(), car8);
        service.addCarToList(service.getCars(), car9);
        service.addCarToList(service.getCars(), car10);
    }
}
