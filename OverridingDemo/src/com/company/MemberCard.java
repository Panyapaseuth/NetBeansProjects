package com.company;

public abstract class MemberCard {
    private String firstName, lastName;

    public MemberCard(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MemberCard() {
    }

    @Override
    public String toString() {
        return String.format("firstname = %s, lastname = %s", firstName, lastName);
//        return super.toString();
    }

    /*    @Override
    public String toString() {
        return "MemberCard{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }*/

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

    public float discount(float amount) {
        if (amount > 1000f) {
            return amount*0.02f;
        }
        else {
            return 0f;
        }
    }

    //must implement this method in subclass
    public abstract float rewardXpoint();

    //subclass can't override this method
    public final int calcPoint(float amount){
        return (int)((amount / 20) * rewardXpoint());
    }
}
