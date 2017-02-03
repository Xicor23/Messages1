package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Messages {
    public String number;
    public String message;
    public Date time;
    public Messages(String num, String mes){
        number = num;
        message = mes;
    }
    public String getMessage(){
        return message;
    }
    public String getNumber(){
        return number;
    }
    public String getTime(){
        time = new Date(System.currentTimeMillis());
        DateFormat dt = new SimpleDateFormat("HH:mm");
        String actualtime = dt.format(time);
        return actualtime;
    }


}