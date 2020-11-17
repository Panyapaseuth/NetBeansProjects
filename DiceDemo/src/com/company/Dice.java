package com.company;

import java.util.Random;

public class Dice {

    private int[] freqs = new int[6]; // 0-5

    public int[] getFreqs() {
        return freqs;
    }

    public int roll() {
        //ramdom between 1-6
        Random r = new Random();
//        return r.nextInt(6) + 1; // 0-5
        int face = r.nextInt(6) + 1; // 0-5
        freqs[face - 1] = freqs[face - 1] + 1;
        return face;

    }
}
