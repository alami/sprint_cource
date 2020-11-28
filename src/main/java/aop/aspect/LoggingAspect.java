package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void getBook (aop.Book, ..))")
    public void beforeGetBookAdvice () {
        System.out.println(color.BLUE+"beforeGetBookAdvice: попытка получить книгу"+color.RESET);
    }
    @Before("execution(public void return* ())")
    public void beforeReturnBookAdvice () {
        System.out.println(color.BLUE+"beforeReturnBookAdvice: попытка вернуть книгу"+color.RESET);
    }
}
