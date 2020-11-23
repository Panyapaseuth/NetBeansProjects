package com.company;

public interface IPhone {
    void call(String phonenumber);
    void hangup();
    void sendSMS(String phonenumer, String message);
}
