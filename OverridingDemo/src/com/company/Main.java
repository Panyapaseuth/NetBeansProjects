package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        demoCard();
    }

/*    public static void demo1(){
        MemberCard m1 = new MemberCard("Peter", "Parker");
        System.out.println(m1.toString());
    }*/

    public static void demoCard(){
        PlatinumCard p1 = new PlatinumCard();
        System.out.println(p1.discount(1000f));
        System.out.println("Point you get = " + p1.calcPoint(1000f));


        GoldCard g1 = new GoldCard();
        System.out.println(g1.discount(2000f));

        SilverCard s1 = new SilverCard();
        System.out.println(s1.discount(3000f));
    }

}
