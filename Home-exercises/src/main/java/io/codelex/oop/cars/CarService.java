package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.*;

public class CarService {

    List<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
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

        List<Car> cars = new ArrayList<>();

        //1) Added car objects to cars list.
        addCarToList(cars, car1);
        addCarToList(cars, car2);
        addCarToList(cars, car3);
        addCarToList(cars, car4);
        addCarToList(cars, car5);
        addCarToList(cars, car6);
        addCarToList(cars, car7);
        addCarToList(cars, car8);
        addCarToList(cars, car9);
        addCarToList(cars, car10);
        displayCarList(cars);
        //2) Removes car from cars list.
        removeCarFromList(cars, car1);
        //3) Display cars list.
        displayCarList(cars);
        //4) Returns only cars with V12 engine.
        List<Car> carsV12 = carsWithV12(cars);
        displayCarList(carsV12);
        //5) Returns only cars produced before 1999.
        List<Car> carsB1999 = carsBefore1999(cars);
        displayCarList(carsB1999);
        //6) Returns only most expensive car.
        List<Car> carsMaxCost = carsMaxCost(cars);
        displayCarList(carsMaxCost);
        //7) Returns cheapest car.
        List<Car> carsMinCost = carsMinCost(cars);
        displayCarList(carsMinCost);
        //8) Returns cars with at least 3 manufacturers.
        List<Car> carsWithThreeManu = carsWithThreeManufacturers(cars);
        displayCarList(carsWithThreeManu);
        //9) Returns ascending or descending cars list by car name, from user input.
        List<Car> carsAscendingName = carsAscendingName(cars);
        displayCarList(carsAscendingName);
        //10) Returns specific car from the list.
        List<Car> carsFindCar = carsFindCar(cars, "Skyline");
        displayCarList(carsFindCar);
        //11) Returns a list of cars by a specific manufacturer.
        List<Car> carsFindByManufacturer = carsFindByManufacturer(cars, "Volvo");
        displayCarList(carsFindByManufacturer);
        //12) Returns list of cars from specific manufacturer. User inputs year with which to compare to year of cars production, if true puts in the list.
        List<Car> carsFindManuYear = carsFindManuYear(cars);
        displayCarList(carsFindManuYear);
    }

    public static List<Car> addCarToList(List<Car> cars, Car car) {
        cars.add(car);
        return cars;
    }

    public static List<Car> removeCarFromList(List<Car> cars, Car car) {
        cars.remove(car);
        return cars;
    }

    public static void displayCarList(List<Car> cars) {

        cars.forEach(car -> {
            System.out.print("Car name: " + car.getCarName());
            System.out.print(", Model: " + car.getModel());
            System.out.print(", Price: " + car.getPrice());
            System.out.print(", Year of manufacture: " + car.getYearMade());
            System.out.println();
            car.manufacturers1.forEach(manu -> {
                System.out.print("Manufacturer name: " + manu.getName());
                System.out.print(", Year of establishment: " + manu.getYear());
                System.out.print(", Country: " + manu.getCountry());
                System.out.println();
            });
            System.out.print("Engine type: " + car.getEngineType());
            System.out.println();
        });
    }

    public static List<Car> carsWithV12(List<Car> cars) {
        List<Car> carsV12 = new ArrayList<>();
        carsV12 = cars.stream().filter(car -> {
            return car.engineType.equals(EngineType.V12);
        }).toList();
        return carsV12;
    }

    public static List<Car> carsBefore1999(List<Car> cars) {
        List<Car> carsB1999 = new ArrayList<>();
        carsB1999 = cars.stream().filter(car -> {
            return car.getYearMade() > 1999;
        }).toList();
        return carsB1999;
    }

    public static List<Car> carsMaxCost(List<Car> cars) {
        List<Car> carsMaxCost = new ArrayList<>();
        BigDecimal temp = BigDecimal.ZERO;
        for (int i = 0; i < cars.size(); i++) {
            temp = cars.get(i).getPrice().max(temp);
        }
        for (int j = 0; j < cars.size(); j++) {
            if (cars.get(j).getPrice().equals(temp)) {
                carsMaxCost.add(cars.get(j));
            }
        }
        return carsMaxCost;
    }

    public static List<Car> carsMinCost(List<Car> cars) {
        List<Car> carsMinCost = new ArrayList<>();
        BigDecimal temp = BigDecimal.valueOf(1000000000 * 100);
        for (int i = 0; i < cars.size(); i++) {
            temp = cars.get(i).getPrice().min(temp);
        }
        for (int j = 0; j < cars.size(); j++) {
            if (cars.get(j).getPrice().equals(temp)) {
                carsMinCost.add(cars.get(j));
            }
        }
        return carsMinCost;
    }

    public static List<Car> carsWithThreeManufacturers(List<Car> cars) {
        List<Car> carsWithThreeManu = new ArrayList<>();
        carsWithThreeManu = cars.stream().filter(car -> {
            return car.manufacturers1.size() >= 3;
        }).toList();
        return carsWithThreeManu;
    }

    public static List<Car> carsAscendingName(List<Car> cars) {
        List<Car> carsAscendingName = new ArrayList<>();
        carsAscendingName.addAll(cars);
        Scanner key = new Scanner(System.in);
        System.out.print("Please input how to sort \"Up\" for ascending and \"Down\" for descending order by cars name: ");
        String UpDown = key.nextLine();
        if (UpDown.equals("Up")) {
            Collections.sort(carsAscendingName, Comparator.comparing(Car::getCarName));
        }
        if (UpDown.equals("Down")) {
            Collections.sort(carsAscendingName, Comparator.comparing(Car::getCarName));
            Collections.reverse(carsAscendingName);
        }
        return carsAscendingName;
    }

    public static List<Car> carsFindCar(List<Car> cars, String carName) {
        List<Car> carsFindCar = new ArrayList<>();
        carsFindCar = cars.stream().filter(car -> car.getCarName().equals(carName)).toList();
        return carsFindCar;
    }

    public static List<Car> carsFindByManufacturer(List<Car> cars, String manufacturer) {
        List<Car> carsFindByManufacturer = new ArrayList<>();
        for (int j = 0; j < cars.size(); j++) {
            for (int i = 0; i < cars.get(j).manufacturers1.size(); i++) {
                if (cars.get(j).manufacturers1.get(i).getName().equals(manufacturer)) {
                    carsFindByManufacturer.add(cars.get(j));
                }
            }
        }
        return carsFindByManufacturer;
    }

    public static List<Car> carsFindManuYear(List<Car> cars) {
        List<Car> carsFindManuYear = new ArrayList<>();
        Scanner key = new Scanner(System.in);
        System.out.print("Please input manufacturers name: ");
        String manuName = key.nextLine();
        System.out.print("Please input a year: ");
        int yearSearch = key.nextInt();
        key.nextLine();
        System.out.print("Please input <, >, <=, >=, ==, != from year: ");
        String compareSymbol = key.nextLine();

        for (int j = 0; j < cars.size(); j++) {
            for (int i = 0; i < cars.get(j).manufacturers1.size(); i++) {
                if (cars.get(j).manufacturers1.get(i).getName().equals(manuName)) {
                    if (compareSymbol.equals("<")) {
                        if (cars.get(j).getYearMade() < yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                    if (compareSymbol.equals(">")) {
                        if (cars.get(j).getYearMade() > yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                    if (compareSymbol.equals("<=")) {
                        if (cars.get(j).getYearMade() <= yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                    if (compareSymbol.equals(">=")) {
                        if (cars.get(j).getYearMade() >= yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                    if (compareSymbol.equals("==")) {
                        if (cars.get(j).getYearMade() == yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                    if (compareSymbol.equals("!=")) {
                        if (cars.get(j).getYearMade() != yearSearch) {
                            carsFindManuYear.add(cars.get(j));
                        }
                    }
                }
            }
        }
        return carsFindManuYear;
    }
}
