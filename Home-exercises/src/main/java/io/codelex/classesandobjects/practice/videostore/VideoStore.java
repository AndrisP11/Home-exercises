package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoStore {

    public static ArrayList<Video> inventory = new ArrayList<>();

    public void addVideo(Video vid) {
        inventory.add(vid);
    }

    public void getVideoByTitle(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getTitle().equals(name)) {
                inventory.get(i).setCheckout(true);
                displayI(i);
            }
        }
    }

    public void returnVideo(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getTitle().equals(name)) {
                inventory.get(i).setCheckout(false);
                displayI(i);
            }
        }
    }

    public void ratingVideo(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getTitle().equals(name)) {
                Scanner key = new Scanner(System.in);
                System.out.println("Please enter your rating: ");
                double rate = key.nextDouble();
                double oldAvr = inventory.get(i).getAvrRatings();
                double newAvr = ((rate - 1) / rate) * oldAvr + (1 / rate) * rate;
                inventory.get(i).setAvrRatings(newAvr);
                displayI(i);
            }
        }
    }

    public static ArrayList<Video> getInventory() {
        return inventory;
    }

    public static void displayInventory() {
        for (int i = 0; i < inventory.size(); i++) {
            displayI(i);
        }
    }

    private static void displayI(int i) {
        System.out.println();
        System.out.println(inventory.get(i).getTitle());
        System.out.println(inventory.get(i).isCheckout());
        System.out.println(String.format("%.2f", inventory.get(i).getAvrRatings()));
        System.out.println();
    }
}
