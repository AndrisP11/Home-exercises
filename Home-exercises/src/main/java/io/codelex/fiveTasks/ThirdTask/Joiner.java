package io.codelex.fiveTasks.ThirdTask;

public class Joiner<T> {
    private final String separator = "-";
    private T contents;

    public Joiner(T contents) {
        this.contents = contents;

    }

    public String join(T part) {
        return contents.toString() + separator + part;
    }
}
