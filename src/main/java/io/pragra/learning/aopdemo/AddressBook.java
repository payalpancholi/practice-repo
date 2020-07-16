package io.pragra.learning.aopdemo;

import org.springframework.stereotype.Component;

@Component
public class AddressBook implements IAddress{

    public void AddName(String name){
        //System.out.println(2/0);
        System.out.println(name);
    }
    public void removeName(String name){
        System.out.println(name);
    }

    @Override
    public void address() {
        System.out.println("Brampton......!!");
    }
}
