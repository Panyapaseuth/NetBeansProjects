package com.company;

public class GoldCard extends MemberCard{
   /* @Override
    public float discount(float amount) {
        return super.discount(amount);
    }*/

    @Override
    public float rewardXpoint() {
        return 2f;
    }
}
