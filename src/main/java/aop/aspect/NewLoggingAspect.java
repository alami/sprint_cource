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
                "в библиотеку пытаются вернуть книгу"+color.RESET);
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();

        } catch (Exception e ) {
            System.out.println(color.RED +"AroundReturnBookLoggingAdvice: исключение - "
                    +e +color.RESET);
            targetMethodResult = "Неизвестное название книги";
            throw e;
        }
        System.out.println(color.YELLOW +"AroundReturnBookLoggingAdvice: " +
                "в библиотеку успешно вернули книгу"+color.RESET);
        return targetMethodResult;
    }
}
