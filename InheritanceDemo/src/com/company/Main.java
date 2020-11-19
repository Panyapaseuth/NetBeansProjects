package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student s1 = new Student();
        s1.setFirstName("PEter");
        s1.setLastName("Parker");
        s1.setDob(LocalDate.of(1995, Month.APRIL, 13));
        System.out.println("Age = " + s1.ageYear());

        Staff staff1 = new Staff();
        staff1.setFirstName("sdsfh");
        staff1.setLastName("sadfgfg");
        staff1.setDob(LocalDate.of(1991, Month.APRIL, 20));
        System.out.println("Age = " + staff1.ageYear());

        ExchangeStudent ex1 = new ExchangeStudent();
        ex1.setFirstName("Ann");
        ex1.setLastName("asdgs");
        ex1.setPartnerUniversity("qfghbearg");
    }
}
