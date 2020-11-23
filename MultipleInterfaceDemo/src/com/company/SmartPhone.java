package com.company;

public class SmartPhone implements IPhone, ICamera, IGps {
    @Override
    public void takePhoto() {

    }

    @Override
    public void changeAperture() {

    }

    @Override
    public void changeShutterSpeed() {

    }

    @Override
    public void deletePhoto() {

    }

    @Override
    public void call(String phonenumber) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void sendSMS(String phonenumer, String message) {

    }

    @Override
    public float receiveLatt() {
        return 0;
    }

    @Override
    public float receiveLong() {
        return 0;
    }

    @Override
    public boolean isGpsEnabled() {
        return false;
    }
}
