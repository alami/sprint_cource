package spring_introduction;
public class Cat implements Pet{
    public Cat (){
        System.out.println(color.YELLOW+"Cat bean is created"+color.RESET);
    }    @Override
    public void say() {
        System.out.println(color.YELLOW+"Meow-Meow"+color.RESET);
    }
}