package com.nhnacademy.edu.springframework.messagesender.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimeTraceAop {
    @Pointcut("execution(* com.nhnacademy.edu.springframework.messagesender.service.MessageSendService.doSendMessage())")
    private void anyOldTransfer(){}

    @Around("anyOldTransfer()")
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch=new StopWatch("Logging Tracker");
        try {
            stopWatch.start();

            Object result=pjp.proceed();
            return result;
        }finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }

    @Before("@annotation(timeLogging) &&args(name)")
    public void before(JoinPoint joinPoint, TimeLogging timeLogging, String name) {
        System.out.println("================================");
        System.out.println("signature name : "+joinPoint.getSignature().getName()); //타겟 객체의 메소드 시그니처의 이름
        System.out.println("annotation value : "+timeLogging.value());
        System.out.println("aop args: "+name);
        System.out.println("================================");
    }
}
