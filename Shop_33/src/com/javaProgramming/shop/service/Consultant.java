package com.javaProgramming.shop.service;

import com.javaProgramming.shop.enums.ConsultResult;
import com.javaProgramming.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant() {
    }


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // реалізація (розгалуження купити чи піти)

        return ConsultResult.BUY;

    }


    public void send(){

    }


}
