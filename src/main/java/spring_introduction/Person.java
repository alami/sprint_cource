package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
//    public Person (Pet pet) {
//        System.out.println(color.GREEN+"Person bean is created"+color.RESET);
//        this.pet = pet;
//    }

    @Autowired
    public void anyMethidDI(Pet pet) { //setPet
        System.out.println(color.GREEN+"Class Person : anyMethidDI (set pet)"+color.RESET);
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println(color.GREEN+"Class Person : set surname"+color.RESET);
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println(color.GREEN+"Class Person : set age"+color.RESET);
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet () {
        System.out.println(color.GREEN+"Hello, my lovely Pet!"+color.RESET);
        pet.say();
    }    
}
