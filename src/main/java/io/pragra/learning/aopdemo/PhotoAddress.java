package io.pragra.learning.aopdemo;

import org.springframework.stereotype.Component;

@Component("photo")
public class PhotoAddress implements IAddress {

    @Override
    public void address() {
        System.out.println("Mississauga...!!");
    }
}
