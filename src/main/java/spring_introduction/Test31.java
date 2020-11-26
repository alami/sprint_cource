package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test31 {

    public static void main(String[] args) {

//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
////        Pet pet = context.getBean("myPet", Pet.class);
//        pet.say();
////        Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println(color.RED+person.getSurname() + ", "+person.getAge()+color.RESET);
        context.close();
     
//        Person person1 = new Person(new Cat());
//        person1.callYourPet();
    }

}
