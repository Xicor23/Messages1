package com.company;

import java.util.ArrayList;

public class MessageList {
    public String message;
    public String time;
public ArrayList messages = new ArrayList();
    public MessageList(String mes, String t){
       message=mes;
        time= t;
    }
    public void addmessage(){
        messages.add(message+"   "+time);
    }
    public void delete(int index){
        messages.remove(index-1);
    }
    public void display(){
        System.out.println(messages);
    }


}