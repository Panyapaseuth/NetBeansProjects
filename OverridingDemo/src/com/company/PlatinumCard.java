package com.company;

public class PlatinumCard extends MemberCard{
    //annotation
    @Override
    public float discount(float amount) {
        return amount*0.05f;
    }

    @Override
    public float rewardXpoint() {
        return 3f;
    }
}
