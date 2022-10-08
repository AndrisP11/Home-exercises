package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {

    private String dimensions;
    private int numCopy;
    private int costPerCopy;

    public Poster(int fee, String dimensions, int numCopy, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numCopy = numCopy;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster: dimensions= " + dimensions
                + " number of copies= " + numCopy
                + " cost per copy= " + costPerCopy;
    }
}
