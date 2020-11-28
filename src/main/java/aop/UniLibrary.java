package aop;

import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
    public void getBook () {
        System.out.println(color.GREEN + "Мы берем книгу из UniLibrary " + color.BLACK);
    }
    public void returnBook () {
        System.out.println(color.GREEN + "Мы возвращаем книгу в UniLibrary " + color.BLACK);
    }
    public void getMagazine () {
        System.out.println(color.GREEN + "Мы берем журнал из UniLibrary " + color.BLACK);
    }
    public void returnMagazine () {
        System.out.println(color.GREEN + "Мы возвращаем журнал в UniLibrary " + color.BLACK);
    }
    public void addBook () {
        System.out.println(color.GREEN + "Мы добавляем книгу в UniLibrary " + color.BLACK);
    }
    public void addMagazine () {
        System.out.println(color.GREEN + "Мы добавляем журнал в UniLibrary " + color.BLACK);
    }
}
