package spring_introduction;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {
    public Cat() {
        System.out.println(color.YELLOW + "Cat bean is created" + color.RESET);
    }

    @Override
    public void say() {
        System.out.println(color.YELLOW + "Meow-Meow" + color.RESET);
    }
}