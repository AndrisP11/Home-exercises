package io.codelex.classesandobjects.practice.videostore;

public class Video {
    private String title;
    private boolean checkout;
    private double avrRatings;

    public Video(String title, boolean checkout, double avrRatings) {
        this.title = title;
        this.checkout = checkout;
        this.avrRatings = avrRatings;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public void setAvrRatings(double avrRatings) {
        this.avrRatings = avrRatings;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public double getAvrRatings() {
        return avrRatings;
    }
}
