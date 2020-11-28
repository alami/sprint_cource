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
    @Before("aop.aspect.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAspect () {
        System.out.println(color.RED+"beforeAddExceptionHandlingAspect: " +
                "ловим/обрабатываем исключение при попытке добавления книг/журналов"+color.RESET);
    }
}
