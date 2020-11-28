package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromLibrary(){}
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineToLibrary(){}
//    @Pointcut("allMethodsFromLibrary() && !returnMagazineToLibrary()")
//    private void allMethodsExceptReturnMagazine(){}
//
//    @Before("allMethodsFromLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
//                "writing Log #1"+color.RESET);
//    }
//
//    @Before("allMethodsExceptReturnMagazine()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println(color.BLUE+"beforeGetAndReturnLoggingAdvice: " +
//                "writing Log #10"+color.RESET);
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromLibrary(){}
//
//    @Pointcut("allGetMethodsFromLibrary() || allReturnMethodsFromLibrary()")
//    private void allGetAndReturnMethodsFromLibrary(){}
//
//    @Before("allGetMethodsFromLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
//                "writing Log #1"+color.RESET);
//    }
//
//    @Before("allGetAndReturnMethodsFromLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println(color.BLUE+"beforeGetAndReturnLoggingAdvice: " +
//                "writing Log #3"+color.RESET);
//    }
//
//    @Before("allReturnMethodsFromLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println(color.BLUE+"beforeReturnLoggingAdvice: " +
//                "writing Log #2"+color.RESET);
//    }

    @Before("aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeLoggingBookAdvice () {
        System.out.println(color.BLUE+"beforeGetLoggingAdvice: " +
                "логирование попытки получить книгу/журнал"+color.RESET);
    }
}
