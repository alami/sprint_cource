package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired
//    @Qualifier("cat")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    @Autowired
    public Person (@Qualifier("cat") Pet pet) {
        System.out.println(color.GREEN+"Person bean is created"+color.RESET);
        this.pet = pet;
    }
//    public Person () {
//        System.out.println(color.GREEN+"Person bean is created"+color.RESET);
//    }

//    @Autowired
//    @Qualifier("cat")
    public void setPet(Pet pet) {
        System.out.println(color.GREEN+"Class Person : set pet"+color.RESET);
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
