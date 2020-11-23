package com.company;

public class BUs implements Vehicle {
    @Override
    public int cashRate() {
        return 100;
    }

    @Override
    public int ePassRate() {
        return 90;
    }
}
