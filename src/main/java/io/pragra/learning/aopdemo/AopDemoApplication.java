package io.pragra.learning.aopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AopDemoApplication.class, args);

        try {
            context.getBean(AddressBook.class).AddName("Payal");
        }catch (RuntimeException ex){
            System.out.println("Got Exception");
        }
        context.getBean(AddressBook.class).removeName("Payal1");
        context.getBean(Demo.class).run();
    }

}
