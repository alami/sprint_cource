package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.color;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        University university = context.getBean("university",University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(color.GREEN+students+color.RESET);
        }catch (Exception e) {
            System.out.println(color.RED+"Поймано исключение: "+e+color.RESET);
        }
        context.close();

    }
}
