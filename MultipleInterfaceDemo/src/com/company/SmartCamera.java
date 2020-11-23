package com.company;

public class SmartCamera implements ICamera, IGps {
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
