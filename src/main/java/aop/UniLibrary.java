package aop;

import org.springframework.stereotype.Component;
import spring_introduction.color;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
    public void getBook () {
        System.out.println(color.BLUE + "Мы берем книгу из UniLibrary " + color.BLACK);
    }
    public String returnBook () {
        int i = 10/0;
        System.out.println(color.BLUE + "Мы возвращаем книгу в UniLibrary " + color.BLACK);
        return "Война и мир";
    }
    public void getMagazine () {
        System.out.println(color.BLUE + "Мы берем журнал из UniLibrary " + color.BLACK);
    }
    public void returnMagazine () {
        System.out.println(color.BLUE + "Мы возвращаем журнал в UniLibrary " + color.BLACK);
    }
    public void addBook (String person, Book book) {
        System.out.println(color.BLUE + "Мы добавляем книгу в UniLibrary " + color.BLACK);
    }
    public void addMagazine () {
        System.out.println(color.BLUE + "Мы добавляем журнал в UniLibrary " + color.BLACK);
    }
}
