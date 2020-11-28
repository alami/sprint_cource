package aop.aspect;

import aop.Book;
import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import spring_introduction.color;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsAdvice () {
//        System.out.println(color.YELLOW+"beforeGetStudentsAdvice: " +
//                "логируем получение списка студентов перед методом getStudets");
//    }
//    @AfterReturning(pointcut="execution(* getStudents())"
//                , returning = "students")
//    public void afterReturningGetStudentsAdvice (List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getName();
//        nameSurname = "Mr."+ nameSurname;
//        firstStudent.setName(nameSurname);
//
//        double avrGrade = firstStudent.getAvgGrade();
//        avrGrade = avrGrade +1;
//        firstStudent.setAvgGrade(avrGrade);
//
//        System.out.println(color.YELLOW+"afterReturningGetStudentsAdvice: " +
//                "логируем получение списка студентов после метода  getStudets");
//    }
//    @AfterThrowing (pointcut = "execution(* getStudents())"
//    , throwing = "exception")
//    public void afterThrowingGetStudentsAdvice (Throwable exception) {
//        System.out.println(color.RED +"afterThrowingGetStudentsAdvice:" +
//                " логируем выброс исключения - "+exception+color.RESET);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice () {
        System.out.println(color.YELLOW +"afterGetStudentsAdvice:" +
                " логируем нормальное завершение или выброс исключения"+color.RESET);
    }

}
