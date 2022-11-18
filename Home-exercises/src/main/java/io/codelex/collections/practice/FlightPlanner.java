package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    private static List<String> route = new ArrayList<>();
    private static final Set<String> check = new HashSet<>();
    private static String firstCity;

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        List<String[]> cities = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (String line : lines) {
            cities.add(line.split(" -> "));
            str.append(line.replace(" -> ", ",")).append(",");

        }
        String[] str2 = str.toString().split(",");
        Collections.addAll(check, str2);

        displayAllCities(cities);
        controlPanel(cities);
    }

    public static void controlPanel(List<String[]> cities) {
        boolean isTruth = true;
        while (isTruth) {
            Scanner in = new Scanner(System.in);
            System.out.println();
            System.out.println("What would you like to do: ");
            System.out.println("1 Display all flights");
            System.out.println("2 To create your travel route");
            System.out.println("3 Display your travel route");
            System.out.println("# To exit");
            System.out.print("Please input your choice: ");

            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.println();
                    displayAllCities(cities);
                    break;
                case "2":
                    route.clear();
                    chooseStart(cities);
                    break;
                case "3":
                    if (route.isEmpty()) {
                        System.out.println();
                        System.out.println("Please first finish your travel route!");
                    } else {
                        displayRoute(route);
                    }
                    break;
                case "#":
                    isTruth = false;
                    break;
            }
        }
    }

    public static void displayAllCities(List<String[]> cities) {
        for (String[] city : cities) {
            System.out.println(city[0] + " -> " + city[1]);
        }
    }

    public static void chooseStart(List<String[]> cities) {
        String returnCity;
        List<String> Empty = new ArrayList<>();
        String chosenCity = cityValidator(Empty);

        boolean isTruth3 = false;
        for (String[] city : cities) {
            if (city[0].equals(chosenCity)) {
                System.out.println("You have chosen: " + chosenCity);
                setFirstCity(chosenCity);
                returnCity = chooseCity(cities, chosenCity);
                navigate(cities, returnCity);
                isTruth3 = true;
                break;
            }
            if (isTruth3) {
                break;
            }
        }
    }

    public static String chooseCity(List<String[]> cities, String chosenCity) {

        List<String> availableCities = findPossibleFlight(cities, chosenCity);
        System.out.print("Available flights are: ");
        for (int i = 0; i < availableCities.size(); i++) {
            if (i == availableCities.size() - 1) {
                System.out.println(availableCities.get(i));
            } else {
                System.out.print(availableCities.get(i) + " | ");
            }
        }
        String nextCity = cityValidator(availableCities);
        route.add(chosenCity);
        route.add(nextCity);
        displayRoute(route);

        return nextCity;
    }

    public static List<String> findPossibleFlight(List<String[]> cities, String chosenCity) {
        List<String> availableCities = new ArrayList<>();
        for (String[] city : cities) {
            if (city[0].equals(chosenCity)) {
                availableCities.add(city[1]);
            }
        }
        return availableCities;
    }

    public static String getFirstCity() {
        return firstCity;
    }

    public static void setFirstCity(String firstCity) {
        FlightPlanner.firstCity = firstCity;
    }

    public static void navigate(List<String[]> cities, String returnCity) {

        boolean isTruth2 = true;
        while (isTruth2) {
            returnCity = chooseCity(cities, returnCity);
            if (returnCity.equals(getFirstCity())) {
                isTruth2 = false;
            }
        }
    }

    private static void displayRoute(List<String> route) {
        System.out.println();
        for (int i = 0; i < route.size(); i++) {
            if (i == 0) {
                System.out.print(route.get(i) + " -> ");
            } else if (i % 2 == 0) {
                System.out.print(route.get(i) + " -> ");
            } else {
                System.out.print(route.get(i) + "\n");
            }
        }
    }

    private static String cityValidator(List<String> available) {
        String chosenCity = "";
        Scanner in = new Scanner(System.in);
        boolean isTruth4 = true;
        while (isTruth4) {
            System.out.print("Please input starting city of your route: ");
            chosenCity = in.nextLine();
            if (available.isEmpty()) {
                for (String town : check) {
                    if (chosenCity.equals(town)) {
                        isTruth4 = false;
                        break;
                    }
                }
            } else {
                for (String town : available) {
                    if (chosenCity.equals(town)) {
                        isTruth4 = false;
                        break;
                    }
                }
            }
            if (isTruth4) {
                System.out.println("Invalid city name! Try again.\n");
            }
        }
        return chosenCity;
    }
}
