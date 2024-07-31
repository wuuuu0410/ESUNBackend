package com.example.ESUNBANKBackend.constants;

public enum ResMessage {
    SUCCESS(200, "Success"),//
    UPDATE_SUCCESS(200,"update success"),//
    EMP_ID_NOT_FOUND(400,"empId not found"),//
    SEAT_EXISTS(400,"seat exists"),//
    NOT_FOUND(404,"not found"),//
    EMAIL_EXISTS(400,"email exists")
    ;

    private int code;

    private String message;

    private ResMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
