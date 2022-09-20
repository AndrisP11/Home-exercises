package io.codelex.classesandobjects.practice.Exercise4;

import java.util.ArrayList;

public class Movie {

    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        ArrayList<Movie> movies2 = getPG(movies);
        System.out.println(movies2);
    }

    private static ArrayList<Movie> getPG(ArrayList<Movie> movies) {
        ArrayList<Movie> movies2 = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                movies2.add(movie);
            }
        }
        return movies2;
    }

    @Override
    public String toString() {
        return "Movie title= " + title +
                ", studio= " + studio +
                ", rating= " + rating;
    }
}
