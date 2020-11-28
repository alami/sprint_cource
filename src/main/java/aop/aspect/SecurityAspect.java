package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspect.MyPointcuts.allGetMethods()")
    public void beforeGetSecurityAdvice () {
        System.out.println(color.BLUE+"beforeGetSecurityAdvice: " +
                "проверка прав на получение книг/журналов"+color.RESET);
    }
}
