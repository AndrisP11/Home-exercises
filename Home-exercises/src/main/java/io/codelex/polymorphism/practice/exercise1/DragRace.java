package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        Audi audi = new Audi();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Mazda mazda = new Mazda();
        Tesla tesla = new Tesla();
        Toyota toyota = new Toyota();

        List<Car> dragRace = new ArrayList<>();
        dragRace.add(audi);
        dragRace.add(bmw);
        dragRace.add(lexus);
        dragRace.add(mazda);
        dragRace.add(tesla);
        dragRace.add(toyota);
        int maxSpeed = 0;
        String carWithMaxSpeed = "";
        for (int i = 0; i < 10; i++) {
            for (Car car : dragRace) {
                car.startEngine();
                if (i == 2) {
                    if (car instanceof Boost) {
                        ((Boost) car).useNitrousOxideEngine();
                    }
                }
                System.out.println(car.showCurrentSpeed());
                if (maxSpeed <= Integer.parseInt(car.showCurrentSpeed())) {
                    maxSpeed = Integer.parseInt(car.showCurrentSpeed());
                    carWithMaxSpeed = car.getClass().getSimpleName();
                }
            }
        }
        System.out.println("Max speed was: " + maxSpeed);
        System.out.println("Fastest car was: " + carWithMaxSpeed);
    }
}
