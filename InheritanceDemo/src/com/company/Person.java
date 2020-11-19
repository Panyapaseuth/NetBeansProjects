package com.company;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
        private String firstName, lastName;
        private LocalDate dob;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int ageYear(){
        Period p = Period.between(dob, LocalDate.now());
        return p.getYears();
    }
}
