package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_introduction.color;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(color.BLUE + "метод main() start" + color.RESET);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary",UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println(color.BLUE + "вернули книгу " +bookName+ color.RESET);
        context.close();
        System.out.println(color.BLUE + "метод main() finished" + color.RESET);

    }
}
