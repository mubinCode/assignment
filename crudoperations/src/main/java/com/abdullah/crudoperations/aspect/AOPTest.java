package com.abdullah.crudoperations.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.abdullah.crudoperations.entity.Student;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j // Simple Logging Facade for Java (SLF4J)
@Component
public class AOPTest {

    @Pointcut("execution(* com.abdullah.crudoperations.controller.*.*(..))")
    public void logggingPointCut() {
    }

    // @Before("logggingPointCut()")
    // public void before(JoinPoint joinPoint) {
    //     log.info("Join point before method invoking : " + joinPoint.getSignature());

    // }

    // @After("logggingPointCut()")
    // public void after(JoinPoint joinPoint) {
    //     log.info("Join point after method invoking : " + joinPoint.getSignature());

    // }

    @AfterReturning(value = "logggingPointCut()", returning = "student")
    public void afterReturning(JoinPoint joinPoint, Student student) {
        log.info("Join point while return invoking : " + student);

    }
    // @AfterThrowing(value = "logggingPointCut()", throwing = "ex")
    // public void afterThrowing(JoinPoint joinPoint, Exception ex) {
    //     log.info("Join point while throwing invoking : " + ex.getCause());

    // }
    @Around(value = "logggingPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Join point while around invoking : " + joinPoint.getArgs()[0]);
        if(joinPoint.proceed() instanceof Student){
            log.info("An instance of student : ",joinPoint.getArgs()[0]);
        }
        return joinPoint.proceed();

    }

}
