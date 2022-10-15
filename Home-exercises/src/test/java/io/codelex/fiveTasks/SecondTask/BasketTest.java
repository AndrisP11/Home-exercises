package io.codelex.fiveTasks.SecondTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BasketTest {

    @Test
    void basketOverMaxTest() {
        List<Integer> inter = new ArrayList<>();
        inter.add(5);
        inter.add(7);
        inter.add(9);
        Basket basket = new Basket(inter);
        basket.addToBasket(8);
        basket.addToBasket(7);
        basket.addToBasket(6);
        basket.addToBasket(5);
        basket.addToBasket(8);
        basket.addToBasket(7);
        basket.addToBasket(6);

        Assertions.assertThrows(BasketFullException.class, () -> {
            basket.addToBasket(5);
        });
    }

    @Test
    void basketOverEmptyTest() {
        List<Apple> apples = new ArrayList<>();
        Basket basket3 = new Basket(apples);
        Apple apple1 = new Apple();

        Assertions.assertThrows(BasketEmptyException.class, () -> {
            basket3.removeFromBasket(apple1);
        });
    }

    @Test
    void basketDiferentClassTest() {
        List<Apple> apples = new ArrayList<>();
        Basket basket3 = new Basket(apples);
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Mushroom mushroom1 = new Mushroom();
        basket3.addToBasket(apple1);
        basket3.addToBasket(apple2);

        Assertions.assertThrows(DiferentClass.class, () -> {
            basket3.addToBasket(mushroom1);
        });
    }

    @Test
    void basketOnlyApplesTest() {
        List<Apple> apples = new ArrayList<>();
        Basket basket3 = new Basket(apples);
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        basket3.addToBasket(apple1);
        basket3.addToBasket(apple2);
        String result = "";
        for (int i = 0; i < basket3.getBasket().size(); i++) {
            result = result + " - " + basket3.getBasket().get(i).getClass();
        }

        Assertions.assertEquals(" - class io.codelex.fiveTasks.SecondTask.Apple - class io.codelex.fiveTasks.SecondTask.Apple", result);
    }

    @Test
    void basketOnlyMushroomsTest() {
        List<Mushroom> mushrooms = new ArrayList<>();
        Basket basket3 = new Basket(mushrooms);
        Mushroom mushroom1 = new Mushroom();
        Mushroom mushroom2 = new Mushroom();
        basket3.addToBasket(mushroom1);
        basket3.addToBasket(mushroom2);
        String result = "";
        for (int i = 0; i < basket3.getBasket().size(); i++) {
            result = result + " - " + basket3.getBasket().get(i).getClass();
        }

        Assertions.assertEquals(" - class io.codelex.fiveTasks.SecondTask.Mushroom - class io.codelex.fiveTasks.SecondTask.Mushroom", result);
    }
}
