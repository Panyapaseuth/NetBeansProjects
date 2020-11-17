package com.company;

public class Contact {
    private String firstname, lastname;
    private String phoneNumber;

    public Contact(){

    }

    public Contact(String firstname, String lastname, String phoneNumber) {
        setFirstname(firstname);
        setLastname(lastname);
        setPhoneNumber(phoneNumber);
        /*this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;*/
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        //petER -> Peter
        Utils util = new Utils();
        this.firstname = util.capitalizeFirstCharOfString(firstname);
        /*this.firstname = firstname.substring(0,1).toUpperCase()+
        firstname.substring(1).toLowerCase();*/
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {

        Utils util = new Utils();
        this.lastname = util.capitalizeFirstCharOfString(lastname);
        /*this.lastname = lastname.substring(0,1).toUpperCase()+
                lastname.substring(1).toLowerCase();*/
    }

/*    private String capitalizeFirstCharOfString(String s){
        return s.substring(0,1).toUpperCase()+
                s.substring(1).toLowerCase();
    }*/

    public String getPhoneNumber() {
        return prettyFormatPhoneNUmber();
    }

    public void setPhoneNumber(String phoneNumber) {
        // \D -> non numberic charactor
        this.phoneNumber = phoneNumber.replaceAll("[\\D]",""); // regular expression
    }

    public String prettyFormatPhoneNUmber(){
        if(phoneNumber.length() == 9){
            return phoneNumber.replaceAll("(\\d{2})(\\d{3})(\\d{4})", "($1) $2 $3");
        }
        else {
            return phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})", "($1) $2 $3");

        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + prettyFormatPhoneNUmber() + '\'' +
                '}';
    }
}
