package com.example.ESUNBANKBackend.vo;

public class BasicRes {

    private int statusCode;
	
	private String message;

    public BasicRes() {
    }

    public BasicRes(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
    
}
