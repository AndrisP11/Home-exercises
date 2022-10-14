package io.codelex.fiveTasks.SecondTask;

import java.util.List;

public class Basket <T>{
    private T contents;
    private List<T> basket;
    private int size = basket.size();

    public Basket(T contents) {
        this.contents = contents;
    }

    public void addToBasket(T elem){
        if(size==10){
            throw new BasketFullException("Basket is full. Can't add another element.");
        }
        basket.add(elem);
    }

    public void removeFromBasket(T elem){
        if(size==0){
            throw new BasketEmptyException("Basket is empty. Can't remove another element.");
        }
        basket.remove(elem);
    }
}
