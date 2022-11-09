package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.*;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCarToList(List<Car> cars, Car car) {
        cars.add(car);
    }

    public static Car manualAddCarToList() {
        Scanner key = new Scanner(System.in);
        System.out.print("Please input car name: ");
        String carName = key.nextLine();
        System.out.print("Please input car model: ");
        String model = key.nextLine();
        System.out.print("Please input year car was made: ");
        int yearMade = key.nextInt();
        key.nextLine();
        System.out.print("Please input cars price: ");
        BigDecimal price = key.nextBigDecimal();
        key.nextLine();
        List<Manufacturer> forCar11 = new ArrayList<>();

        boolean isTrue = false;
        while (!isTrue) {
            System.out.print("Please input car manufacturer name: ");
            String manuName = key.nextLine();
            System.out.print("Please input car manufacturers year of establishment: ");
            int yearEstablish = key.nextInt();
            key.nextLine();
            System.out.print("Please input car manufacturers country: ");
            String manuCountry = key.nextLine();
            Manufacturer manufacturer21 = new Manufacturer(manuName, yearEstablish, manuCountry);
            forCar11.add(manufacturer21);
            System.out.print("Please input \"y\" if you want to add another manufacturer to this car, or \"n\" to continue : ");
            String choice = key.nextLine();
            if (choice.equals("n")) {
                isTrue = true;
            }
        }
        System.out.print("Please choose car engine from V12, V8, V6, S6, S4, S3: ");
        String TypeEngine = key.nextLine();
        Car car11 = new Car(carName, model, yearMade, price, forCar11, EngineType.valueOf(TypeEngine));
        return car11;
    }

    public static List<Car> removeCarFromList(List<Car> cars, String carName2) {
        cars = cars.stream().filter(car -> !car.getCarName().equals(carName2)).toList();
        return cars;
    }

    public static void displayCarList(List<Car> cars) {

        cars.forEach(car -> {
            System.out.print("Car name: " + car.getCarName());
            System.out.print(", Model: " + car.getModel());
            System.out.print(", Price: " + car.getPrice());
            System.out.print(", Year of manufacture: " + car.getYearMade());
            System.out.println();
            car.getManufacturers().forEach(manu -> {
                System.out.print("Manufacturer name: " + manu.getName());
                System.out.print(", Year of establishment: " + manu.getYear());
                System.out.print(", Country: " + manu.getCountry());
                System.out.println();
            });
            System.out.print("Engine type: " + car.getEngineType());
            System.out.println();
        });
    }

    public static List<Car> findCarsByEngineType(List<Car> cars, EngineType engineType) {
        List<Car> carsEngine = new ArrayList<>();
        carsEngine = cars.stream().filter(car -> {
            return car.engineType.equals(engineType);
        }).toList();
        return carsEngine;
    }

    public static List<Car> carsBeforeYear(List<Car> cars, int year) {
        List<Car> carsBefore = new ArrayList<>();
        carsBefore = cars.stream().filter(car -> {
            return car.getYearMade() < year;
        }).toList();
        return carsBefore;
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

    public static List<Car> carsWithThreeManufacturers(List<Car> cars, int count) {
        List<Car> carsWithThreeManu = new ArrayList<>();
        carsWithThreeManu = cars.stream().filter(car -> {
            return car.getManufacturers().size() >= count;
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

    public static List<Car> findByManufacturer(List<Car> cars, String manufacturer) {
        List<Car> findByManufacturer = new ArrayList<>();
        for (int j = 0; j < cars.size(); j++) {
            for (int i = 0; i < cars.get(j).getManufacturers().size(); i++) {
                if (cars.get(j).getManufacturers().get(i).getName().equals(manufacturer)) {
                    findByManufacturer.add(cars.get(j));
                }
            }
        }
        return findByManufacturer;
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
            for (int i = 0; i < cars.get(j).getManufacturers().size(); i++) {
                if (cars.get(j).getManufacturers().get(i).getName().equals(manuName)) {
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
