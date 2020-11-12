package com.company;

public class Contact {
    private String firstname, lastname;
    private String phoneNumber;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        //petER -> Peter
        this.firstname = firstname.substring(0,1).toUpperCase()+
        firstname.substring(1).toLowerCase();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname.substring(0,1).toUpperCase()+
                lastname.substring(1).toLowerCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // \D -> non numberic charactor
        this.phoneNumber = phoneNumber.replaceAll("[\\D]",""); // regular expression
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
