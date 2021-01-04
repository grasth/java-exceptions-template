package com.epam.izh.rd.online.exception;

public class SimplePasswordException extends Throwable {
    public SimplePasswordException() {
        System.out.println("Пароль не соответствует требованиям безопасности");
    }

    public SimplePasswordException(String message) {
        super(message);
    }

    public SimplePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimplePasswordException(Throwable cause) {
        super(cause);
    }
}
