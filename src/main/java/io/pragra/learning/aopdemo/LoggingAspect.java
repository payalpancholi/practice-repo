package io.pragra.learning.aopdemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before(" pt1()")
    public void doLogging(JoinPoint jp){

        System.out.println(jp.getSignature().toLongString());
        System.out.println(Arrays.toString(jp.getArgs()));
        System.out.println("I am a aspect advice");
    }
    @After("pt1()")
    public void anotherLog(){

    }
    @Pointcut("execution(* io.pragra.learning.aopdemo.AddressBook.*(..))")
    public void pt1(){

    }
    @Pointcut("execution(* io.pragra.learning.aopdemo.Demo.run())")
    public void pt2(){

    }
}
