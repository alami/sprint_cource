package aop;

import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
public class Library {
    public void getBook () {
        System.out.println(color.GREEN + "Мы берем книгу" + color.BLACK);
    }
}
