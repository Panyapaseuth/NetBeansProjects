package com.company;

public class Main {

    public static void demo1(){
        Contact p1 = new Contact();
        p1.setFirstname("petER"); //Peter
        p1.setLastname("PARKER"); //Parker
        p1.setPhoneNumber("(08)-1456-7894"); //0814567894

        System.out.println(p1);
        System.out.println(p1.getPhoneNumber());

        Contact p2 = new Contact("bruce", "waYnE","123456789");

        System.out.println(p2);
        System.out.println(p2.getPhoneNumber());

    }

    public static void main(String[] args) {
	// write your code here
        demo1();
    }
}
