package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate video (as user)");
            System.out.println("Choose 5 to display movies");
            System.out.println("Choose 6 to add a movie");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    rateMMovie(keyboard);
                    break;
                case 5:
                    VideoStore.displayInventory();
                    break;
                case 6:
                    addVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            addVideo(scanner);
        }
        VideoStore.displayInventory();
    }

    private static void rentVideo(Scanner scanner) {
        //todo - rent video
        VideoStore video = new VideoStore();
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        video.getVideoByTitle(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        //todo - return video
        VideoStore video = new VideoStore();
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        video.returnVideo(movieName);
    }

    private static void rateMMovie(Scanner scanner) {
        VideoStore video = new VideoStore();
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        video.ratingVideo(movieName);
    }

    private static void addVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        System.out.println("Enter rating");
        double rating = scanner.nextDouble();
        //todo - add video
        Video vid = new Video(movieName, false, rating);
        VideoStore video = new VideoStore();
        video.addVideo(vid);
    }
}
