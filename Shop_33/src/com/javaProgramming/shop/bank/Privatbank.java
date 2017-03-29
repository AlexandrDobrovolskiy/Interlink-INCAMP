package com.javaProgramming.shop.bank;

public class Privatbank extends AbstractBank {



    public Privatbank(String name, String creditDescription) {
        super(name, creditDescription);
    }

    @Override
    public void checkInfo() {
        super.checkInfo();
    }

    @Override
    public void giveCredit() {
        // допрацьована реалізація
    }


    public void checkInfo(boolean critical){

    }
}
