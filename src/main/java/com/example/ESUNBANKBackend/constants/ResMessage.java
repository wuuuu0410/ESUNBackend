package com.example.ESUNBANKBackend.constants;

public enum ResMessage {
    SUCCESS(200, "Success"),
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
