package com.epam.izh.rd.online.exception;

public class NotAccessException extends Throwable {
    public NotAccessException() {
        System.out.println("Недостаточно прав для выполнения операции");
    }

    public NotAccessException(String message) {
        super(message);
    }

    public NotAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }
}
