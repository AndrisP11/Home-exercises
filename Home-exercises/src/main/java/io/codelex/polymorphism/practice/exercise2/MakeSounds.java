package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();
        Parrot parrot2 = new Parrot();
        Radio radio2 = new Radio();
        Firework firework2 = new Firework();

        List<Sound> sounds = new ArrayList<>();
        sounds.add(radio);
        sounds.add(firework);
        sounds.add(parrot);
        sounds.add(firework2);
        sounds.add(parrot2);
        sounds.add(radio2);
        for (Sound sound : sounds) {
            sound.playSound();
        }
    }
}
