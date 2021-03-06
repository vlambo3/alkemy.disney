package com.alkemy.disney.disney.enumuration;

public enum ErrorEnum {
    ID_MOVIE_NOT_FOUND ("Id Movie Not Found"),
    ID_CHARACTER_NOT_FOUND ("Id Character Not Found"),
    ERROR_TRYING_TO_SEND_MAIL ("Error triyng to send mail");

    private final String message;

    private ErrorEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message();
    }

    private String message() {
        return message;
    }
}
