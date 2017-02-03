package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Messages m;
        MessageList m1;
        boolean a = true;
        while(a=true) {
            System.out.println("What do you want to do? Press 1 to send a message, 2 to delete a message, 3 to move a message, 4 to display messages, or 5 to exit");
            int answer = scan.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("What phone number do you want to send the message to?");
                    String phone = scan.next();
                    System.out.println("What message do you want to send?");
                    String message = scan.next();
                    m = new Messages(phone, message);
                    m1 = new MessageList(message, m.getTime());
                    m1.addmessage();
                    break;
                case 2:
                    System.out.println("What number message do you want to delete?");
                    int index = scan.nextInt();
                    m1.delete(index);
                    break;
                case 3:

                    break;
                case 4:
                    m1.display();
                    break;
                case 5:
                    a=false;
            }
        }
    }
}