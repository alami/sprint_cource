package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

    public static void main(String[] args) {

//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
////        Pet pet = context.getBean("myPet", Pet.class);
        Dog myDog  = context.getBean("myPet", Dog.class);
//        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Strelka");
//        pet.say();
////        Person person = new Person(pet);
        System.out.println("Is the same object ?" + (myDog==yourDog));
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.);


         context.close();
     
//        Person person1 = new Person(new Cat());
//        person1.callYourPet();
    }

}
