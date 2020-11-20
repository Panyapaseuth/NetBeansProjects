package com.company;

public class SilverCard extends MemberCard{
    @Override
    public float discount(float amount) {
        if(amount > 2000f){
            return amount*0.03f;
        }
        else {
            return 0f;
        }
    }

    @Override
    public float rewardXpoint() {
        return 1f;
    }
}
