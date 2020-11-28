package aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(public void get* ())")
    public void allGetMethods(){}

}
