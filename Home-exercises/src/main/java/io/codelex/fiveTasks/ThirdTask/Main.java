package io.codelex.fiveTasks.ThirdTask;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer> inte = new Joiner<>(3);
        String result = inte.join(4);
        System.out.println(result);
    }


}
