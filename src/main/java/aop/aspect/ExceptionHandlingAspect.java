package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {
    @Before("aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingAspect () {
        System.out.println(color.BLUE+"beforeGetExceptionHandlingAspect: " +
                "ловим/обрабатываем исключение при попытке получения книг/журналов"+color.RESET);
    }
}
