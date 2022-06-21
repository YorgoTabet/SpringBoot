package com.learningSpring.restfulwebservices.helloWorld;

public class HelloWorldBean {

    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message, String name) {
        this.message = message + ' ' + name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
