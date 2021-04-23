package com.example.fn;

public class Message {

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
    public Message(String message) {
        this.message = message;
    }
}
