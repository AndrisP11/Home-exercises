package io.codelex.fiveTasks.FirstTask;

public class NotEnoughFundsException extends RuntimeException {
    public NotEnoughFundsException(String message) {
        super((message));
    }
}

