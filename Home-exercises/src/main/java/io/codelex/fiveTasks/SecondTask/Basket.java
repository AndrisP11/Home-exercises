package io.codelex.fiveTasks.SecondTask;

import java.util.List;

public class Basket<T> {
    private List<T> basket;

    public Basket(List<T> basket) {
        this.basket = basket;
    }

    public void addToBasket(T elem) {
        if (basket.size() == 10) {
            throw new BasketFullException("Basket is full. Can't add another element.");
        }
        if (basket.size() > 0) {
            if (basket.get(0).getClass().equals(elem.getClass())) {
            } else {
                throw new DiferentClass("Basket can't add element of different class.");
            }
        }
        basket.add(elem);
    }

    public void removeFromBasket(T elem) {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty. Can't remove another element.");
        }

        basket.remove(elem);
    }

    public List<T> getBasket() {
        return basket;
    }
}
