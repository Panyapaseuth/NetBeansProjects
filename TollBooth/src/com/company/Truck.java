package com.company;

public class Truck implements Vehicle {
    @Override
    public int cashRate() {
        return 80;
    }

    @Override
    public int ePassRate() {
        return 70;
    }
}
