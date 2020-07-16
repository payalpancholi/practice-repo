package io.pragra.learning.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Demo {

    @Autowired
    @Qualifier("photo")
    private IAddress add;

    public void run(){
        add.address();
        System.out.println("Running");
    }
    @PostConstruct
    public void init(){
        System.out.println("********************I am Running**********************");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("********************I am Destroying********************");
    }
}
