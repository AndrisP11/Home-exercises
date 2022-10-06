package io.codelex.exceptions.practice;

public class NonPositiveNumberException extends Exception {
    String negativeNumber;

    public NonPositiveNumberException(String negative_number) {
        this.negativeNumber = negative_number;
    }
}
