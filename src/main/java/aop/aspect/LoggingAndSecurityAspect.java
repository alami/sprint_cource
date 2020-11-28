package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
public class LoggingAndSecurityAspect {
    @Pointcut("execution(public void get* ())")
    private void allGtMethods(){}

    @Before("allGtMethods()")
    public void beforeLoggingBookAdvice () {
        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
                "попытка получить книгу/журнал"+color.RESET);
    }
    @Before("allGtMethods()")
    public void beforeGetSecurityAdvice () {
        System.out.println(color.BLUE+"beforeGetSecurityAdvice: " +
                "проверка прав на получение книг/журналов"+color.RESET);
    }
}
