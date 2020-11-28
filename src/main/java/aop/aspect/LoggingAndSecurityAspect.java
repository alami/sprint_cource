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
    @Pointcut("execution(* aop.UniLibrary.get*())")
    private void allGetMethodsFromLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.return*())")
    private void allReturnMethodsFromLibrary(){}

    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
    private void allGetAndReturnMethodsFromLibrary(){}

    @Before("allGetMethodsFromLibrary()")
    public void beforeGetLoggingAdvice(){
        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
                "writing Log #1"+color.RESET);
    }

    @Before("allGetAndReturnMethodsFromLibrary()")
    public void beforeGetAndReturnLoggingAdvice(){
        System.out.println(color.BLUE+"beforeGetAndReturnLoggingAdvice: " +
                "writing Log #3"+color.RESET);
    }

    @Before("allReturnMethodsFromLibrary()")
    public void beforeReturnLoggingAdvice(){
        System.out.println(color.BLUE+"beforeReturnLoggingAdvice: " +
                "writing Log #2"+color.RESET);
    }

//    @Pointcut("execution(public void get* ())")
//    private void allGtMethods(){}
//
//    @Before("allGtMethods()")
//    public void beforeLoggingBookAdvice () {
//        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
//                "попытка получить книгу/журнал"+color.RESET);
//    }
//    @Before("allGtMethods()")
//    public void beforeGetSecurityAdvice () {
//        System.out.println(color.BLUE+"beforeGetSecurityAdvice: " +
//                "проверка прав на получение книг/журналов"+color.RESET);
//    }
}
