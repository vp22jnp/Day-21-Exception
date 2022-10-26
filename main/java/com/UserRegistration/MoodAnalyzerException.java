package com.UserRegistration;

public class MoodAnalyzerException extends RuntimeException {
    enum Exceptiontype {
        ENTERED_NULL, ENTERED_EMPTY
    }
    Exceptiontype type;
    public MoodAnalyzerException(Exceptiontype type,String message){
        super(message);
        this.type=type;
    }
}

