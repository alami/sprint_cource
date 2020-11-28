package aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution (public String returnBook())")
    public Object AroundReturnBookLoggingAdvice (ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {

        System.out.println(color.YELLOW +"AroundReturnBookLoggingAdvice: " +
                "в библиотеку пытаются книгу"+color.RESET);
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println(color.YELLOW +"AroundReturnBookLoggingAdvice: " +
                "в библиотеку успешно вернули книгу за " +
                (end-begin)+" msec"+color.RESET);
        return targetMethodResult;
    }
}
