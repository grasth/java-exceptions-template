package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Throwable {
    public NotCorrectPasswordException() {
        System.out.println("Пароль введен неверно!");
    }

    public NotCorrectPasswordException(String message) {
        super(message);
    }

    public NotCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotCorrectPasswordException(Throwable cause) {
        super(cause);
    }
}
