package com.company;

import java.util.Random;

public class DiceV2 {
    private int[] freqs = new int[6]; // 0-5

    public int[] getFreqs() {
        return freqs;
    }

    private static Random R = new Random();

    private int counts = 0;

    private char diceFace;

    public char getDiceFace() {
        return diceFace;
    }

    public static char numberToFace(int face){
        return (char)(face -1 + '\u2680');
    }

    public int roll() {
        counts++;
        //ramdom between 1-6
//        Random r = new Random(); // expensive process
//        return r.nextInt(6) + 1; // 0-5
        int face = R.nextInt(6) + 1; // 0-5
        freqs[face - 1] = freqs[face - 1] + 1;
        diceFace = (char)(face -1 + '\u2680');
        return face;

    }

    public void showFreq(){
        for (int i = 0; i < freqs.length; i++)
            {
                System.out.printf("face %d occurs %d times (%.2f%%)\n", i+1,
                        freqs[i],
                        (float)freqs[i]/(float)counts*100);
            }
    }
}
