package spring_introduction;

public class Person {
    private Pet pet;
    public Person (/*Pet pet*/) {
        System.out.println(color.GREEN+"Person bean is created"+color.RESET);
        this.pet = pet;
    }
    public void setPet(Pet pet) {
        System.out.println(color.GREEN+"Class Person : set pet"+color.RESET);
        this.pet = pet;
    }    
    public void callYourPet () {
        System.out.println(color.GREEN+"Hello, my lovely Pet!"+color.RESET);
        pet.say();
    }    
}
