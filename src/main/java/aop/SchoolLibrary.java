package aop;

import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
public class SchoolLibrary extends AbstractLibrary {

    @Override
    public void getBook () {
        System.out.println(color.GREEN + "Мы берем книгу из SchoolLibrary" + color.BLACK);
    }
}
