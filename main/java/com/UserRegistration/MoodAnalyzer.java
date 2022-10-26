package com.UserRegistration;

public class MoodAnalyzer {
    String message;
    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String message){
        this.message=message;
    }
    public String analyzeMood()throws MoodAnalyzerException{
        try{
            if(message.length()==0){
                throw new MoodAnalyzerException(MoodAnalyzerException.Exceptiontype.ENTERED_EMPTY,"Enter proper message.EMPTY not allowed");
            }
            if (this.message.contains("sad")){
                return "SAD";
            }else{
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalyzerException(MoodAnalyzerException.Exceptiontype.ENTERED_NULL,"Enter proper message.EMPTY not allowed");
        }
    }
}


